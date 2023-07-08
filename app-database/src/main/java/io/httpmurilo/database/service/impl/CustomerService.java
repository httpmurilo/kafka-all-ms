package io.httpmurilo.database.service.impl;

import io.httpmurilo.database.entity.Customer;
import io.httpmurilo.database.repository.ICustomerRepository;
import io.httpmurilo.database.service.ICustomerService;


public class CustomerService implements ICustomerService {

    ICustomerRepository customerRepository;

    public CustomerService(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void createUser(String nome, String cpf, String email, String Status) {
        customerRepository.save(dtoToCustomer(nome, cpf, email, Status));
    }

    @Override
    public Customer dtoToCustomer(String nome, String cpf, String email, String Status) {
       Customer customer = new Customer.Builder()
                                       .nome(nome)
                                       .cpf(cpf)
                                       .email(email)
                                       .status(Status)
                                       .build();
       return customer;
    }

    @Override
    public void changeToInvalidaCustomer(String email) {
        var c = findByEmail(email);
        c.setStatus("INVALIDO");
        customerRepository.save(c);
    }

    @Override
    public Customer findByEmail(String email) {
        return customerRepository.findByEmail(email);
    }
}

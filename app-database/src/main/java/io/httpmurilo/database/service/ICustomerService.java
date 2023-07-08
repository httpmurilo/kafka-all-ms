package io.httpmurilo.database.service;

import io.httpmurilo.database.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public interface ICustomerService {

    void createUser(String nome, String cpf, String email, String Status);
    Customer dtoToCustomer(String nome, String cpf, String email, String Status);
    void changeToInvalidaCustomer(String email);
    Customer findByEmail(String email);
}

package io.httpmurilo.database.repository;

import io.httpmurilo.database.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

    Customer findByEmail(String email);
}

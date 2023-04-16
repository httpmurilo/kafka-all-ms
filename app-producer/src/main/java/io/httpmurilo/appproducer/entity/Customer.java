package io.httpmurilo.appproducer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    private Integer id;
    private String name;
    private Integer cpf;
}

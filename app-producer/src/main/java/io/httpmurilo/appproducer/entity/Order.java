package io.httpmurilo.appproducer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Order {

    @Id
    private Integer id;
    private Integer number_order;
    private Customer customer;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
    private OrderItens itens;
    private OrderShipment orderShipment;
    private Payment payment;
}
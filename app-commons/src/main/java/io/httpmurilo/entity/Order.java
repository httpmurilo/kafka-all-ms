package io.httmurilo.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Order {

    @Id
    private Integer id;
    private Integer number_order;
    private Customer customer;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
    @ManyToMany(mappedBy = "orderItens")
    private List<OrderItens> orderItens = new ArrayList<>();
    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private OrderShipment orderShipment;
    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;
}
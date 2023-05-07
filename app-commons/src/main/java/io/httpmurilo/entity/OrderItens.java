package io.httmurilo.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class OrderItens {

    @Id
    private Integer id;
    private String name;
    private Double price;

    @ManyToMany
    @JoinTable(name = "OrderOrderItens",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "order_itens_id"))
    private List<Order> orders = new ArrayList<>();
}

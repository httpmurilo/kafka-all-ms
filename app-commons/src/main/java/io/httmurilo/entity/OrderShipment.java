package io.httmurilo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class OrderShipment {

    @Id
    private Integer id;
    private String name;
    private String price;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

}

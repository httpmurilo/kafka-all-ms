package io.httpmurilo.database.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Payment {

    @Id
    private Integer id;
    private String status;
    private String type;


    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;
}

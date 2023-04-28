package com.learningspring.courier.company.model;

import jakarta.persistence.*;
import lombok.Data;


import java.time.Instant;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "Delivery")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "courier_id")
    private Courier courier;

    @Column(name = "delivery_address")
    private String deliveryAddress;

    @Column(name = "pickup_address")
    private String pickupAddress;

    @Column(name = "pickup_date")
    private LocalDate pickupDate;

    @Column(name = "delivery_date")
    private LocalDate deliveryDate;

    @Column(name = "status")
    private String status;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;



}

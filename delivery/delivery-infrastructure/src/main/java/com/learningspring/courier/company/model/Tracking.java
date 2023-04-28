package com.learningspring.courier.company.model;

import jakarta.persistence.*;
import lombok.Data;


import java.time.Instant;


@Data
@Entity
@Table(name = "Tracking")
public class Tracking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tracking_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    @Column(name = "status")
    private String status;

    @Column(name = "location")
    private String location;

    @Column(name = "updated_at")
    private Instant updatedAt;


}
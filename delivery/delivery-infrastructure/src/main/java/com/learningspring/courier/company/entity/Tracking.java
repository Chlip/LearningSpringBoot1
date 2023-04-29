package com.learningspring.courier.company.entity;

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

    public Tracking(Long id, Delivery delivery, String status, String location, Instant updatedAt) {
        this.id = id;
        this.delivery = delivery;
        this.status = status;
        this.location = location;
        this.updatedAt = updatedAt;
    }

    public Tracking() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }
}
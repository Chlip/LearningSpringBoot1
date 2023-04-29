package com.learningspring.courier.company;


import com.learningspring.courier.company.entity.Delivery;
import com.learningspring.courier.company.entity.Tracking;
import com.learningspring.courier.company.repository.TrackingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.time.Instant;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class TrackingRepositoryTest {
    @Autowired
    private TestEntityManager em;

    @Autowired
    private TrackingRepository trackingRepository;

    @Test
    public void createTracking(){
        Delivery delivery = new Delivery();
        delivery.setDeliveryAddress("deliveryAddress");
        delivery.setPickupAddress("pickupAddress");
        delivery.setPickupDate(LocalDate.now());
        delivery.setStatus("NEW");
        delivery.setCreatedAt(Instant.now());
        delivery.setUpdatedAt(Instant.now());
        em.persist(delivery);

        Tracking tracking = new Tracking();
        tracking.setDelivery(delivery);
        tracking.setStatus("NEW");
        tracking.setLocation("testLocation");
        tracking.setUpdatedAt(Instant.now());
        assertNull(tracking.getId());
        trackingRepository.save(tracking);
        assertNotNull(tracking.getId());
        assertEquals("testLocation", tracking.getLocation());

    }
    @Test
    public void updateTracking(){
        Delivery delivery = new Delivery();
        delivery.setDeliveryAddress("deliveryAddress");
        delivery.setPickupAddress("pickupAddress");
        delivery.setPickupDate(LocalDate.now());
        delivery.setStatus("NEW");
        delivery.setCreatedAt(Instant.now());
        delivery.setUpdatedAt(Instant.now());
        em.persist(delivery);

        Tracking tracking = new Tracking();
        tracking.setDelivery(delivery);
        tracking.setStatus("NEW");
        tracking.setLocation("testLocation");
        tracking.setUpdatedAt(Instant.now());
        assertNull(tracking.getId());
        trackingRepository.save(tracking);
        assertNotNull(tracking.getId());
        assertEquals("testLocation", tracking.getLocation());
        tracking.setLocation("testLocationUpdated");
        trackingRepository.save(tracking);
        assertEquals("testLocationUpdated", tracking.getLocation());
    }
    @Test
    public void deleteTracking(){
        Delivery delivery = new Delivery();
        delivery.setDeliveryAddress("deliveryAddress");
        delivery.setPickupAddress("pickupAddress");
        delivery.setPickupDate(LocalDate.now());
        delivery.setStatus("NEW");
        delivery.setCreatedAt(Instant.now());
        delivery.setUpdatedAt(Instant.now());
        em.persist(delivery);

        Tracking tracking = new Tracking();
        tracking.setDelivery(delivery);
        tracking.setStatus("NEW");
        tracking.setLocation("testLocation");
        tracking.setUpdatedAt(Instant.now());
        assertNull(tracking.getId());
        trackingRepository.save(tracking);
        assertNotNull(tracking.getId());
        assertEquals("testLocation", tracking.getLocation());
        trackingRepository.delete(tracking);
        assertFalse(trackingRepository.existsById(tracking.getId()));
    }
}

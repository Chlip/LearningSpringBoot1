package com.learningspring.courier.company;

import com.learningspring.courier.company.entity.Courier;
import com.learningspring.courier.company.repository.CourierRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class CourierRepositoryTest {
    @Autowired
    private TestEntityManager em;

    @Autowired
    private CourierRepository courierRepository;

    @Test
    public void createCourier(){
        Courier courier = new Courier();
        courier.setName("testName");
        courier.setPhoneNumber("123123123");
        courier.setEmail("testemail@email.com");
        courier.setCreatedAt(Instant.now());
        courier.setUpdatedAt(Instant.now());
        assertNull(courier.getId());
        courierRepository.save(courier);
        assertNotNull(courier.getId());
        assertEquals("testName", courier.getName());
    }
    @Test
    public void updateCourier(){
        Courier courier = new Courier();
        courier.setName("testName");
        courier.setPhoneNumber("123123123");
        courier.setEmail("testemail@email.com");
        courier.setCreatedAt(Instant.now());
        courier.setUpdatedAt(Instant.now());
        assertNull(courier.getId());
        courierRepository.save(courier);
        assertNotNull(courier.getId());
        assertEquals("testName", courier.getName());
        courier.setName("testNameUpdated");
        courierRepository.save(courier);
        assertEquals("testNameUpdated", courierRepository.getById(courier.getId()).getName());
    }
    @Test
    public void deleteCourier(){
        Courier courier = new Courier();
        courier.setName("testName");
        courier.setPhoneNumber("123123123");
        courier.setEmail("testemail@email.com");
        courier.setCreatedAt(Instant.now());
        courier.setUpdatedAt(Instant.now());
        assertNull(courier.getId());
        courierRepository.save(courier);
        assertNotNull(courier.getId());
        assertEquals("testName", courier.getName());
        courierRepository.delete(courier);
        assertFalse(courierRepository.existsById(courier.getId()));
    }
}

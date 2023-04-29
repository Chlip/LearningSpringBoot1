package com.learningspring.courier.company;

import com.learningspring.courier.company.entity.Courier;
import com.learningspring.courier.company.entity.Customer;
import com.learningspring.courier.company.entity.Delivery;
import com.learningspring.courier.company.entity.Order;
import com.learningspring.courier.company.repository.DeliveryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.time.Instant;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
@DataJpaTest
public class DeliveryRepositoryTest {
    @Autowired
    private TestEntityManager em;

    @Autowired
    private DeliveryRepository deliveryRepository;

    @Test
    public void createDelivery(){
        Courier courier = new Courier();
        courier.setName("testName");
        courier.setPhoneNumber("123123123");
        courier.setEmail("testemail@email.com");
        courier.setCreatedAt(Instant.now());
        courier.setUpdatedAt(Instant.now());
        em.persist(courier);

        Customer customer = new Customer();
        customer.setName("testCustomer");
        customer.setAddress("Address");
        customer.setPhoneNumber("123123123");
        customer.setEmail("testcustomer@email.com");
        customer.setCreatedAt(Instant.now());
        customer.setUpdatedAt(Instant.now());
        em.persist(courier);

        Order order = new Order();
        order.setCourier(courier);
        order.setCustomer(customer);
        order.setDeliveryAddress("deliveryAddress");
        order.setPickupAddress("pickupAddress");
        order.setPickupDate(LocalDate.now());
        order.setStatus("NEW");
        order.setCreatedAt(Instant.now());
        order.setUpdatedAt(Instant.now());
        em.persist(order);


        Delivery delivery = new Delivery();
        delivery.setCourier(courier);
        delivery.setOrder(order);
        delivery.setDeliveryAddress("deliveryAddress");
        delivery.setPickupAddress("pickupAddress");
        delivery.setPickupDate(LocalDate.now());
        delivery.setStatus("NEW");
        delivery.setCreatedAt(Instant.now());
        delivery.setUpdatedAt(Instant.now());
        assertNull(delivery.getId());
        deliveryRepository.save(delivery);
        assertNotNull(delivery.getId());

    }
    @Test
    public void updateDelivery(){
        Courier courier = new Courier();
        courier.setName("testName");
        courier.setPhoneNumber("123123123");
        courier.setEmail("testemail@email.com");
        courier.setCreatedAt(Instant.now());
        courier.setUpdatedAt(Instant.now());
        em.persist(courier);

        Customer customer = new Customer();
        customer.setName("testCustomer");
        customer.setAddress("Address");
        customer.setPhoneNumber("123123123");
        customer.setEmail("testcustomer@email.com");
        customer.setCreatedAt(Instant.now());
        customer.setUpdatedAt(Instant.now());
        em.persist(courier);

        Order order = new Order();
        order.setCourier(courier);
        order.setCustomer(customer);
        order.setDeliveryAddress("deliveryAddress");
        order.setPickupAddress("pickupAddress");
        order.setPickupDate(LocalDate.now());
        order.setStatus("NEW");
        order.setCreatedAt(Instant.now());
        order.setUpdatedAt(Instant.now());
        em.persist(order);


        Delivery delivery = new Delivery();
        delivery.setCourier(courier);
        delivery.setOrder(order);
        delivery.setDeliveryAddress("deliveryAddress");
        delivery.setPickupAddress("pickupAddress");
        delivery.setPickupDate(LocalDate.now());
        delivery.setStatus("NEW");
        delivery.setCreatedAt(Instant.now());
        delivery.setUpdatedAt(Instant.now());
        assertNull(delivery.getId());
        deliveryRepository.save(delivery);
        assertNotNull(delivery.getId());
        delivery.setDeliveryAddress("deliveryAddressUpdated");
        deliveryRepository.save(delivery);
        assertEquals("deliveryAddressUpdated", delivery.getDeliveryAddress());
    }
    @Test
    public void deleteDelivery(){
        Courier courier = new Courier();
        courier.setName("testName");
        courier.setPhoneNumber("123123123");
        courier.setEmail("testemail@email.com");
        courier.setCreatedAt(Instant.now());
        courier.setUpdatedAt(Instant.now());
        em.persist(courier);

        Customer customer = new Customer();
        customer.setName("testCustomer");
        customer.setAddress("Address");
        customer.setPhoneNumber("123123123");
        customer.setEmail("testcustomer@email.com");
        customer.setCreatedAt(Instant.now());
        customer.setUpdatedAt(Instant.now());
        em.persist(courier);

        Order order = new Order();
        order.setCourier(courier);
        order.setCustomer(customer);
        order.setDeliveryAddress("deliveryAddress");
        order.setPickupAddress("pickupAddress");
        order.setPickupDate(LocalDate.now());
        order.setStatus("NEW");
        order.setCreatedAt(Instant.now());
        order.setUpdatedAt(Instant.now());
        em.persist(order);


        Delivery delivery = new Delivery();
        delivery.setCourier(courier);
        delivery.setOrder(order);
        delivery.setDeliveryAddress("deliveryAddress");
        delivery.setPickupAddress("pickupAddress");
        delivery.setPickupDate(LocalDate.now());
        delivery.setStatus("NEW");
        delivery.setCreatedAt(Instant.now());
        delivery.setUpdatedAt(Instant.now());
        assertNull(delivery.getId());
        deliveryRepository.save(delivery);
        assertNotNull(delivery.getId());
        deliveryRepository.delete(delivery);
        assertFalse(deliveryRepository.findById(delivery.getId()).isPresent());
    }
}

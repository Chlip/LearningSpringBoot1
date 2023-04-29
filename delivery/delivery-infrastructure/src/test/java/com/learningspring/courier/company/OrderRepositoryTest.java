package com.learningspring.courier.company;

import com.learningspring.courier.company.entity.Courier;
import com.learningspring.courier.company.entity.Customer;
import com.learningspring.courier.company.entity.Order;
import com.learningspring.courier.company.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.time.Instant;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class OrderRepositoryTest {
    @Autowired
    private TestEntityManager em;

    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void createOrder(){
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
        assertNull(order.getId());
        orderRepository.save(order);
        assertNotNull(order.getId());
        assertEquals("deliveryAddress", order.getDeliveryAddress());
    }

    @Test
    public void updateOrder(){
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
        assertNull(order.getId());
        orderRepository.save(order);
        assertNotNull(order.getId());
        order.setDeliveryAddress("deliveryAddressUpdated");
        orderRepository.save(order);
        assertEquals("deliveryAddressUpdated", order.getDeliveryAddress());
    }
    @Test
    public void deleteOrder(){
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
        assertNull(order.getId());
        orderRepository.save(order);
        assertNotNull(order.getId());
        orderRepository.delete(order);
        assertFalse(orderRepository.existsById(order.getId()));
    }
}

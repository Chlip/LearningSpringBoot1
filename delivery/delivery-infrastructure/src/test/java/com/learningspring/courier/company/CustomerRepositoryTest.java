package com.learningspring.courier.company;
import com.learningspring.courier.company.entity.Customer;
import com.learningspring.courier.company.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;


import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class CustomerRepositoryTest {

    @Autowired
    private TestEntityManager em;

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void createCustomer() {

        Customer customer = new Customer();
        customer.setName("testCustomer");
        customer.setAddress("Address");
        customer.setPhoneNumber("123123123");
        customer.setEmail("testcustomer@email.com");
        customer.setCreatedAt(Instant.now());
        customer.setUpdatedAt(Instant.now());
        assertNull(customer.getId());
        customerRepository.save(customer);
        assertNotNull(customer.getId());
        assertEquals("testCustomer", customer.getName());

    }
    @Test
    public void updateCustomer() {

        Customer customer = new Customer();
        customer.setName("testCustomer");
        customer.setAddress("Address");
        customer.setPhoneNumber("123123123");
        customer.setEmail("testcustomer@email.com");
        customer.setCreatedAt(Instant.now());
        customer.setUpdatedAt(Instant.now());
        assertNull(customer.getId());
        customerRepository.save(customer);
        assertNotNull(customer.getId());
        customer.setName("testCustomerUpdated");
        customerRepository.save(customer);
        assertEquals("testCustomerUpdated", customerRepository.getById(customer.getId()).getName());

    }
    @Test
    public void deleteCustomer() {

        Customer customer = new Customer();
        customer.setName("testCustomer");
        customer.setAddress("Address");
        customer.setPhoneNumber("123123123");
        customer.setEmail("testcustomer@email.com");
        customer.setCreatedAt(Instant.now());
        customer.setUpdatedAt(Instant.now());
        assertNull(customer.getId());
        customerRepository.save(customer);
        assertNotNull(customer.getId());
        assertEquals("testCustomer", customer.getName());
        customerRepository.delete(customer);
        assertFalse(customerRepository.existsById(customer.getId()));

    }

}

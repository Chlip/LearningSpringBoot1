package com.learningspring.courier.company;


import com.learningspring.courier.company.entity.Customer;
import com.learningspring.courier.company.entity.Order;
import com.learningspring.courier.company.repository.impl.JdbcTemplateRepoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class JdbcTemplateRepoImplTest {
    @Autowired
    private TestEntityManager em;

    @Autowired
    private JdbcTemplateRepoImpl jdbcTemplateRepoImpl;

    @Test
    public void getCustomers(){
        for (Integer i=0; i<5; i++){
            Customer customer = new Customer();
            customer.setName("testCustomer" + i.toString());
            customer.setAddress("Address");
            customer.setPhoneNumber("123123123");
            customer.setEmail("testcustomer@email.com");
            customer.setCreatedAt(Instant.now());
            customer.setUpdatedAt(Instant.now());
            em.persist(customer);
        }

        assertEquals("testCustomer4", jdbcTemplateRepoImpl.findCustomersByName("testCustomer4").get(0).get("NAME"));
        assertEquals("Address", jdbcTemplateRepoImpl.findCustomersByName("testCustomer4").get(0).get("ADDRESS"));
        assertEquals("123123123", jdbcTemplateRepoImpl.findCustomersByName("testCustomer4").get(0).get("PHONE_NUMBER"));
        assertEquals("testcustomer@email.com", jdbcTemplateRepoImpl.findCustomersByName("testCustomer4").get(0).get("EMAIL"));
    }

}

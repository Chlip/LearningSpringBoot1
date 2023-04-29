package com.learningspring.courier.company.repository;


import com.learningspring.courier.company.entity.Courier;
import com.learningspring.courier.company.entity.Order;

import java.util.List;
import java.util.Map;

public interface JdbcTemplateRepo {
    public List<Map<String, Object>> findCustomersByName(String name);

}

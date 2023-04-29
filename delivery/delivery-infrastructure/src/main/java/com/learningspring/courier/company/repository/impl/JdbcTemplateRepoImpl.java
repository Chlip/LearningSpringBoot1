package com.learningspring.courier.company.repository.impl;

import com.learningspring.courier.company.entity.Courier;
import com.learningspring.courier.company.entity.Order;
import com.learningspring.courier.company.repository.JdbcTemplateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class JdbcTemplateRepoImpl implements JdbcTemplateRepo {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Override
    public List<Map<String, Object>> findCustomersByName(String name){
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("name", name);
        List<Map<String, Object>> customers = namedParameterJdbcTemplate.queryForList("SELECT * FROM CUSTOMERS WHERE NAME=:name", namedParameters);
        return customers;
    }


}

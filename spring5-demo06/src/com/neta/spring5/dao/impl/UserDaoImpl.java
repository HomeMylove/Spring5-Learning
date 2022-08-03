package com.neta.spring5.dao.impl;

import com.neta.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "update t_account set money=money+? where username=?";
        int add = jdbcTemplate.update(sql, 100, "Klee");
        System.out.println("Klee add 100");
    }

    @Override
    public void reduceMoney() {
        String sql = "update t_account set money=money-? where username=?";
        int reduce = jdbcTemplate.update(sql, 100, "Jean");
        System.out.println("Jean reduce 100");
    }
}

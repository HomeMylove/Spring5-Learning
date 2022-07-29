package com.neta.spring5.dao.impl;

import com.neta.spring5.dao.UserDAO;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {
    @Override
    public void add() {
        System.out.println("dao add ......");
    }
}

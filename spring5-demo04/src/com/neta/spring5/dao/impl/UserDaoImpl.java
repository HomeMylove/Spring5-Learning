package com.neta.spring5.dao.impl;

import com.neta.spring5.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}

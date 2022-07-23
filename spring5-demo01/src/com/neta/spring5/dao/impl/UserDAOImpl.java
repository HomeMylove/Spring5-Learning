package com.neta.spring5.dao.impl;

import com.neta.spring5.dao.UserDAO;

public class UserDAOImpl implements UserDAO {
    @Override
    public void update() {
        System.out.println("dao update ......");
    }
}

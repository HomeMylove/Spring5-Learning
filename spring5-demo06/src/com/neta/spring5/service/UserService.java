package com.neta.spring5.service;

import com.neta.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional  // 类上或方法上,类上：未所有方法添加
public class UserService {

    @Autowired
    private UserDao userDao;

    // 转账
    public void accountMoney(){

        userDao.reduceMoney();

        int a = 1/0;
//        异常，则后面的不执行

        userDao.addMoney();
    }

}

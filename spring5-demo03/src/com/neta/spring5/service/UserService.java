package com.neta.spring5.service;

import com.neta.spring5.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



//@Component(value = "userService")
@Service
public class UserService {

    // 不需要 set 方法
    @Autowired  // 根据类型注入
    @Qualifier(value = "userDAOImpl")  // 再根据名称注入
    private UserDAO userDAO;

    @Value(value = "Yae")
    private String name;

    public void add(){
        System.out.println("service add ......");
        userDAO.add();
    }
}


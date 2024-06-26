package com.neta.spring5;

import com.neta.spring5.dao.UserDao;
import com.neta.spring5.dao.impl.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {

    public static void main(String[] args) {
        // 创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};

        // 匿名内部类
//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });
        UserDao userDao = new UserDaoImpl();

        UserDao dao = (UserDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));

        System.out.println(dao.add(1, 2));

        System.out.println(dao.update("Yae"));

    }

}


// 创建代理对象代码
class UserDaoProxy implements InvocationHandler{

    // 创建的是谁的代理对象，把谁传递过来
    // 有参构造传递
    public Object obj;

    public UserDaoProxy(Object obj){
        this.obj = obj;
    }



    // 增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        String name = method.getName();

        if(name.equals("add")){
            return method.invoke(obj,args);
        }

        // 方法之前
        System.out.println("方法之前执行..." +method.getName()+ ":传递的参数..."+ Arrays.toString(args));

        // 返回值
        Object res = method.invoke(obj, args);

        // 方法之后
        System.out.println("方法之后执行..."+obj);

        return res;
    }
}
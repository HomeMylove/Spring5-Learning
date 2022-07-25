package com.neta.spring5.bean;

public class Orders {

    private String oname;

    public Orders(){
        System.out.println("第一步 Orders无参调用...");
    }

    public void setOname(String oname) {
        System.out.println("第二步 Orders setOname 调用...");
        this.oname = oname;
    }

    public void initMethod(){
        System.out.println("第三步 初始化方法执行...");
    }

    public void destroyMethod(){
        System.out.println("第五步 销毁...");
    }

}

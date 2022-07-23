package com.neta.spring5.collectiontype;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    // 数组类型的属性
    private String[] courses;

    // list 类型的属性
    private List<String> list;

    private Map<String,String> maps;

    private Set<String> sets;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void test(){
        System.out.println("courses="+ Arrays.toString(courses));
        System.out.println("list="+list);
        System.out.println("map="+maps);
        System.out.println("set="+sets);
    }




}

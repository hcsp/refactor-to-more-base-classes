package com.github.hcsp.inheritance;

public class Boy extends Human {
//    private String name;
//    private int age;
//
//    public Boy(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }


    public Boy(String name, int age) {
        super(name, age);
    }

    public void sayBoy() {
        System.out.println("我是一个男孩");
    }
}

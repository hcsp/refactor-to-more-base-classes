package com.github.hcsp.inheritance;

public class Cat extends body {
//    private String name;
//
//    public Cat(String name) {
//        this.name = name;
//    }
//
//    public void sayMyName() {
//        System.out.println("我的名字是" + name);
//    }

    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("喵");
    }
}

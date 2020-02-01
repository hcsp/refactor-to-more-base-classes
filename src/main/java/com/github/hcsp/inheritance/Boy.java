package com.github.hcsp.inheritance;

public class Boy extends people {
//    private String name;
//    private int age;
//
//    public Boy(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public void sayMyName() {
//        System.out.println("我的名字是" + name);
//    }
//
//    public void sayMyAge() {
//        System.out.println("我的年龄是" + age);
//    }

    public Boy(String name, int age) {
        super(name, age);
    }

    public void sayBoy() {
        System.out.println("我是一个男孩");
    }
}

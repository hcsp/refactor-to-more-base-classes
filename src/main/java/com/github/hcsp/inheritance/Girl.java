package com.github.hcsp.inheritance;

public class Girl extends Human{
//    private String name;
//    private int age;
//
//    public Girl(String name, int age) {
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
    Girl(String name, int age) {
        super(name, age);
    }
    public void sayGirl() {
        System.out.println("我是一个女孩");
    }
}

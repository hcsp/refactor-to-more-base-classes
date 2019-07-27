package com.github.hcsp.inheritance;

public class Human extends Animal{
    private String name;
    private int age;

    public Human(String name, int age) {
        super(name);
        this.name = name;
        this.age = age;
    }
    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}

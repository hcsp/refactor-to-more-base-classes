package com.github.hcsp.inheritance;

public class Human extends Animal {
    int age;

    Human(String name) {
        super(name);
        this.age = age;
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }

}

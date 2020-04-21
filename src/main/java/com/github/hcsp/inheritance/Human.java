package com.github.hcsp.inheritance;

public class Human extends Animal {
    int age;

    Human(String name, int age) {
        super(name);
        this.age = age;
    }

    void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}

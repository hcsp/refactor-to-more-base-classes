package com.github.hcsp.inheritance;

public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void sayMyName() {
        System.out.println("我的名字是" + name);
    }

    void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}

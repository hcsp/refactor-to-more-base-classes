package com.github.hcsp.inheritance;

public abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void sayMyName() {
        System.out.println("我的名字是" + name);
    }

    protected void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}


package com.github.hcsp.inheritance;

public class Person extends Animal {

    protected int age;

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}

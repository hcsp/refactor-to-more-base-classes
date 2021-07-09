package com.github.hcsp.inheritance;

public class People extends Life {
    private final int age;

    public People(String name, int age) {
        super(name);
        this.age = age;
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}

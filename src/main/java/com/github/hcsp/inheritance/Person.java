package com.github.hcsp.inheritance;

public class Person extends Animal {

    public Person(String name, int age) {
        super(name);
        this.age = age;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }

    protected int age;

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }


}

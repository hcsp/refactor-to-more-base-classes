package com.github.hcsp.inheritance;

public class Person extends Animal{
    private int age;

    public Person(String name,int age) {
        super(name);
        this.age = age;
    }
    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }

}

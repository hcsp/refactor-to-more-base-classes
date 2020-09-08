package com.github.hcsp.inheritance;

public class AnimalPeople {
    private String name;
    private int age;

    public AnimalPeople(String name,int age){
        this.age=age;
        this.name=name;

    }
    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }

}

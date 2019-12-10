package com.github.hcsp.inheritance;

public class Person {
    private String name;
    private int age;

    public  Person (String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + getName());
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + getAge());
    }

}

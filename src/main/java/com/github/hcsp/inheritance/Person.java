package com.github.hcsp.inheritance;

public class Person extends Organism{
    private int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.setAge(age);
        super.setName(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + this.getAge());
    }

}


package com.github.hcsp.inheritance;

public class People extends Animal{
    private int age;
    public People(String name,int age) {

        super(name);
        this.setAge(age);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + getAge());
    }
}

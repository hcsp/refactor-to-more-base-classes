package com.github.hcsp.inheritance;

public class Human extends Creature {
    private int age;

    public int getAge() {
        return age;
    }
    Human(String name,int age){
        super(name);
        this.age = age;
    }
    public void sayMyAge() {
        System.out.println("我的年龄是" + getAge());
    }
}

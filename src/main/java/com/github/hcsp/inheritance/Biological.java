package com.github.hcsp.inheritance;

public class Biological {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public Biological(String name){
        this.name=name;
    }
    public Biological(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
    public void sayMyAge() {
        System.out.println("我的年龄是" + getAge());
    }
}

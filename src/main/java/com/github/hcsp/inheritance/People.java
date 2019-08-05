package com.github.hcsp.inheritance;

public class People extends Base{
    int age;
    public People(String name,int age){
        super(name);
        this.name = name;
        this.age = age;
    }
    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}

package com.github.hcsp.inheritance;

public class Comment {
    String name;
    int age;

    public Comment(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public Comment(String name) {
        this.name = name;
    }


    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}

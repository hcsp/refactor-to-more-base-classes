package com.github.hcsp.inheritance;

public class Girl extends Animal {
    private String name;
    private int age;

    public Girl(String name,int age) {
        super(name);
        this.age = age;
    }


    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }

    public void sayGirl() {
        System.out.println("我是一个女孩");
    }
}

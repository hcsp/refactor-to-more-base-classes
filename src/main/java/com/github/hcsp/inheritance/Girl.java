package com.github.hcsp.inheritance;

public class Girl extends Child {
    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayGirl() {
        System.out.println("我是一个女孩");
    }
}

package com.github.hcsp.inheritance;

public class Girl extends Human {
    public Girl(String name, int age) {
        super(name, age);
        this.age = age;
    }

    public void sayGirl() {
        System.out.println("我是一个女孩");
    }
}

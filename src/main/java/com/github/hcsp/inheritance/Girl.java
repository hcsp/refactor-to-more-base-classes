package com.github.hcsp.inheritance;

public class Girl extends Man{

    public Girl(String name, int age) {
        super(name, age);
    }

    public void sayGirl() {
        System.out.println("我是一个女孩");
    }
}

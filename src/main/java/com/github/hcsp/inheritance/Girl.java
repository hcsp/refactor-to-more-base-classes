package com.github.hcsp.inheritance;

public class Girl extends Information {

    public Girl(String name, int age) {
        setInformation(name, age);
    }

    public void sayGirl() {
        System.out.println("我是一个女孩");
    }
}

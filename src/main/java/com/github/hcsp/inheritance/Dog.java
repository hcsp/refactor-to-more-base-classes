package com.github.hcsp.inheritance;

public class Dog extends Intitle {
    public Dog(String name) {
        super.setName(name);
    }

    public void sayMyName() {
        System.out.println("我的名字是" + super.getName());
    }

    public void wang() {
        super.log("汪");
    }
}

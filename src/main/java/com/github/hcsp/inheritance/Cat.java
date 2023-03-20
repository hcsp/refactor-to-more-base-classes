package com.github.hcsp.inheritance;

public class Cat extends Intitle {
    public Cat(String name) {
        super.setName(name);
    }

    public void sayMyName() {
        System.out.println("我的名字是" + super.getName());
    }

    public void meow() {
        super.log("喵");
    }
}

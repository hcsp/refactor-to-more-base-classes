package com.github.hcsp.inheritance;

public class Boy extends Human {

    Boy(String name, int age) {
        super(name, age);
    }

    public void sayBoy() {
        System.out.println("我是一个男孩");
    }
}

package com.github.hcsp.inheritance;

public class Boy extends Human {

    public Boy(String name, int age) {
        super(name, age);
    }

    void sayBoy() {
        System.out.println("我是一个男孩");
    }
}

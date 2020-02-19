package com.github.hcsp.inheritance;

public class Boy extends Information {


    public Boy(String name, int age) {
        setInformation(name, age);
    }

    public void sayBoy() {
        System.out.println("我是一个男孩");
    }
}

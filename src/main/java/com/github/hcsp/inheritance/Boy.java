package com.github.hcsp.inheritance;

public class Boy extends People{

    public Boy(String name, int age) {
        super(name,age);
        this.name = name;
        this.age = age;
    }

    public void sayBoy() {
        System.out.println("我是一个男孩");
    }
}

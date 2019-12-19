package com.github.hcsp.inheritance;

public class Boy extends Person{

    public Boy(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void sayBoy() {
        System.out.println("我是一个男孩");
    }
}

package com.github.hcsp.inheritance;

public class Boy extends PersonAnimal{
    public Boy(String name, Integer age) {
        super(name, age);
    }

    public void sayBoy() {
        System.out.println("我是一个男孩");
    }
}

package com.github.hcsp.inheritance;

public class Girl extends PersonAnimal {
    public Girl(String name, Integer age) {
        super(name, age);
    }

    public void sayGirl() {
        System.out.println("我是一个女孩");
    }
}

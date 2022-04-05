package com.github.hcsp.inheritance;

public class Boy extends Animal {
    private int age;

    public Boy(String name, int age) {
        super(name);
        this.age = age;
    }


    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }

    public void sayBoy() {
        System.out.println("我是一个男孩");
    }
}

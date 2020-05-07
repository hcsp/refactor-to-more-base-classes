package com.github.hcsp.inheritance;

public class Human extends Organism {
    private int age;

    public int getAge() {
        return age;
    }

    public Human(String name, int Age) {
        super(name);
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}

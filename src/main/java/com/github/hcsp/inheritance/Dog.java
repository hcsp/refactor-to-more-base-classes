package com.github.hcsp.inheritance;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void wang() {
        System.out.println("汪");
    }
}

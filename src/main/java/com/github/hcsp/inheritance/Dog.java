package com.github.hcsp.inheritance;

public class Dog extends Creature {
    public Dog(String name) {
        super(name);
    }

    public void wang() {
        System.out.println("汪");
    }
}

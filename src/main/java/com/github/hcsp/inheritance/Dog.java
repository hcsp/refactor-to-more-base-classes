package com.github.hcsp.inheritance;

public class Dog extends Animal{
    public void wang() {
        System.out.println("汪");
    }

    public Dog(String name) {
        super(name);
    }
}

package com.github.hcsp.inheritance;

public class Dog extends Animal {
    public Dog(String name) {
        super(name,0 );
    }
    public void wang() {
        System.out.println("汪");
    }
}

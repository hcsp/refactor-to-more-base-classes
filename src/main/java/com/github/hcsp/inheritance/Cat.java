package com.github.hcsp.inheritance;

public class Cat extends Organism{

    public Cat() {}

    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("喵");
    }
}

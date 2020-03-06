package com.github.hcsp.inheritance;

public class Cat extends Animal{
    public void meow() {
        System.out.println("喵");
    }

    public Cat(String name) {
        super(name);
    }
}

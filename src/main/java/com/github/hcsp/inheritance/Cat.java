package com.github.hcsp.inheritance;

public class Cat extends Animal{
    public Cat(String name) {
        super(name, 0);
    }
    public void meow() {
        System.out.println("喵");
    }
}

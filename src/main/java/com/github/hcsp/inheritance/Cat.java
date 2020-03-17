package com.github.hcsp.inheritance;

public class Cat extends Zoo {
    public Cat(String name) {
        super (name);
    }

    public void meow() {
        System.out.println("喵");
    }
}

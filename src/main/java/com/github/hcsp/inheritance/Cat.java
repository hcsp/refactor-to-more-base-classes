package com.github.hcsp.inheritance;

public class Cat extends Biological{

    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("喵");
    }
}

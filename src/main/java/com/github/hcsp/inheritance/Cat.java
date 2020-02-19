package com.github.hcsp.inheritance;

public class Cat extends Information {


    public Cat(String name) {
        setInformation(name);
    }

    public void meow() {
        System.out.println("喵");
    }
}

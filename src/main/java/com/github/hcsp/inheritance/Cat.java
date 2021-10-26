package com.github.hcsp.inheritance;

import java.lang.reflect.Method;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("喵");
    }
}

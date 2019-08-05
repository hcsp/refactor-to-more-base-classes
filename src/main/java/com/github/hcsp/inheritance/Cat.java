package com.github.hcsp.inheritance;

public class Cat extends Base{
    public Cat(String name) {
        super(name);
        this.name = name;
    }

    public void meow() {
        System.out.println("喵");
    }
}

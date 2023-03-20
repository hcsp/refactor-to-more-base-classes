package com.github.hcsp.inheritance;

public class Cat extends Intitle {
    public Cat(String name) {
        super.setName(name);
    }

    public void meow() {
        super.log("喵");
    }
}

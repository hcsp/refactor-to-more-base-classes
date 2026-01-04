package com.github.hcsp.inheritance;

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void meow() {
        System.out.println("喵");
    }
}

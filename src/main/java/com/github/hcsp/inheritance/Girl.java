package com.github.hcsp.inheritance;

public class Girl extends Animal{

    public Girl(String name, int age) {
        super(name,age);
    }

    void sayGirl() {
        saySex("女孩");
    }
}

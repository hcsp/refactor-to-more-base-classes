package com.github.hcsp.inheritance;

public class Boy extends Animal{
    public Boy(String name, int age) {
        super(name,age);
    }
    void sayBoy() {
        saySex("男孩");
    }
}

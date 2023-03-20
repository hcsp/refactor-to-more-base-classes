package com.github.hcsp.inheritance;

public class Boy extends Person {

    public Boy(String name, int age) {
        super.setName(name);
        super.setAge(age);
    }

    public void sayBoy() {
        super.log("我是一个男孩");
    }
}

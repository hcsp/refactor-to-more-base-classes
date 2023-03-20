package com.github.hcsp.inheritance;

public class Girl extends Person {

    public Girl(String name, int age) {
        super.setName(name);
        super.setAge(age);
    }

    public void sayGirl() {
        super.log("我是一个女孩");
    }
}

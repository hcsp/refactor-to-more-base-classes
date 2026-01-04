package com.github.hcsp.inheritance;

class Girl extends Gender {
    Girl(String name, int age) {
        super(name, age);
    }

    void sayGirl() {
        System.out.println("我是一个女孩");
    }
}

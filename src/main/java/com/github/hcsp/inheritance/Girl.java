package com.github.hcsp.inheritance;

public class Girl extends Person{

    public Girl(String name, int age) {
        setName(name);
        setAge(age);
    }



    public void sayGirl() {
        System.out.println("我是一个女孩");
    }
}

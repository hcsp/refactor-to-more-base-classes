package com.github.hcsp.inheritance;

public class Boy extends Person {

    public Boy(String name, int age) {
        super.setName(name);
        super.setAge(age);
    }

    public void sayMyName() {
        System.out.println("我的名字是" + super.getName());
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + super.getAge());
    }

    public void sayBoy() {
        super.log("我是一个男孩");
    }
}

package com.github.hcsp.inheritance;

public class Girl extends Person {

    public Girl(String name, int age) {
        super.setName(name);
        super.setAge(age);
    }

    public void sayMyName() {
        System.out.println("我的名字是" + super.getName());
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + super.getAge());
    }

    public void sayGirl() {
        super.log("我是一个女孩");
    }
}

package com.github.hcsp.inheritance;

public class Girl extends Biological{

    public Girl(String name, int age) {
        super(name,age);
    }


    public void sayMyAge() {
        System.out.println("我的年龄是" + getAge());
    }

    public void sayGirl() {
        System.out.println("我是一个女孩");
    }
}

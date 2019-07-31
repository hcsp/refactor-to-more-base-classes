package com.github.hcsp.inheritance;

public class Boy extends Biological{

    public Boy(String name, int age) {
        super(name,age);
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + getAge());
    }

    public void sayBoy() {
        System.out.println("我是一个男孩");
    }
}

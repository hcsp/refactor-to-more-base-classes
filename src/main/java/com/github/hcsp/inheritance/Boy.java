package com.github.hcsp.inheritance;

public class Boy extends Live{
//    private String name;
//    private int age;

    public Boy(String name, int age) {
//        this.name = name;
        super(name, age);
//        this.age = age;
    }


//    public void sayMyAge() {
//        System.out.println("我的年龄是" + super.getAge());
//    }

    public void sayBoy() {
        System.out.println("我是一个男孩");
    }
}

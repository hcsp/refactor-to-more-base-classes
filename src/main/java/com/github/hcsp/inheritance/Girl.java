package com.github.hcsp.inheritance;

public class Girl extends People{
    private String name;
    private int age;

    public Girl(String name, int age) {
        super(name, age);
    }


    public void sayGirl() {
        System.out.println("我是一个女孩");
    }
}

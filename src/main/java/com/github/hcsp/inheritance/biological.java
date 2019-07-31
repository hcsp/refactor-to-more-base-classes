package com.github.hcsp.inheritance;

public class biological {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public biological(String name) {
        this.name = name;
    }

    public biological(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }

}

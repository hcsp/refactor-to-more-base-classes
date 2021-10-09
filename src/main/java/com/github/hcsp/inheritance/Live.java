package com.github.hcsp.inheritance;

public class Live {
    public String getName() {
        return name;
    }

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public Live(String name) {
        this.name = name;
    }
    public Live(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }


}

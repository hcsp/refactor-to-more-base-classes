package com.github.hcsp.inheritance;

public class Information {
    private String name;
    private Integer age;

    public void setInformation(String name) {
        setInformation(name, null);
    }

    public void setInformation(String name, Integer age) {
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

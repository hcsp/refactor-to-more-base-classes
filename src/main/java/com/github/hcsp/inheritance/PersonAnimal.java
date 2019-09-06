package com.github.hcsp.inheritance;

public class PersonAnimal {
    String name;
    Integer age;

    public PersonAnimal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public PersonAnimal(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}


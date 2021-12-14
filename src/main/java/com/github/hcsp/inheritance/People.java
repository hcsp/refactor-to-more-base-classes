package com.github.hcsp.inheritance;

public class People {
    String name;
    int age;
    public People(String MyName, int MyAge){
        name=MyName;
        age=MyAge;
    }
    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}

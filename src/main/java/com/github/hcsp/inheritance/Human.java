package com.github.hcsp.inheritance;

/**
 * describe:
 *
 * @author Gavin
 * @date 2019/09/18
 */
public class Human {
    private String name;
    private int age;

    public Human(String name, int age){
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

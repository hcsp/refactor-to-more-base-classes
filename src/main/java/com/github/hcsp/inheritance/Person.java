package com.github.hcsp.inheritance;

/**
 * @author yaohengfeng
 * @version 1.0
 * @date 2019/12/26 16:49
 */
public class Person extends Say {
    private int age;

    public Person(String name, int age) {
        super(name);
        this.age = age;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}

package com.github.hcsp.inheritance;

class Human extends Creature {
    int age;

    Human(String name, int age){
        super(name);
        this.age = age;
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }



}

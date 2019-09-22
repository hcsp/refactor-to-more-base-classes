package com.github.hcsp.inheritance;

public class Animal {//人也是动物，没有创建子类person，直接合在一起
    private String name;
    private int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    Animal(String name){
        this.name = name;
    }

    void sayMyName(){
        System.out.println("我的名字是" + name);
    }
    void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
    void voice(String voice){//动物应该发出的声音
        System.out.println(voice);
    }
    void saySex(String sex) {//性别
        System.out.println("我是一个"+sex);
    }
}

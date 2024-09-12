package com.github.hcsp.inheritance;

public class Boy extends Human{


    public Boy(String name, int age) {
       super(name,age);
    }

//    public void sayMyName() {
//        System.out.println("我的名字是" + name);
//    }
//
//    public void sayMyAge() {
//        System.out.println("我的年龄是" + age);
//    }

    public void sayBoy() {
       super.sayGender("男孩");
    }
}

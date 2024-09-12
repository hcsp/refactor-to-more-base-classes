package com.github.hcsp.inheritance;

public class Girl extends Human{


    public Girl(String name, int age) {
       super(name,age);
    }

//    public void sayMyName() {
//        System.out.println("我的名字是" + name);
//    }

//    public void sayMyAge() {
//        System.out.println("我的年龄是" + age);
//    }

    public void sayGirl() {
        super.sayGender("女孩");
    }

}

package com.github.hcsp.inheritance;

class Boy extends Gender {
    Boy(String name,int age){
        super(name,age);
    }
   void sayBoy() {
        System.out.println("我是一个男孩");
    }
}

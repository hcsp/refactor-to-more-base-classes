package com.github.hcsp.inheritance;

 class Boy extends Human{

    public Boy(String name, int age) {
        super(name, age);
    }

    public void sayBoy() {
        System.out.println("我是一个男孩");
    }
}

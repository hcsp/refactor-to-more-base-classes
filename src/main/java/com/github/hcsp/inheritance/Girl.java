package com.github.hcsp.inheritance;

 class Girl extends Human{

    public Girl(String name, int age) {
        super(name, age);
    }

    public void sayGirl() {
        System.out.println("我是一个女孩");
    }
}

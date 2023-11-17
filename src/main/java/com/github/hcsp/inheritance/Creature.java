package com.github.hcsp.inheritance;

class Creature {
    String name;

    Creature(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }

}

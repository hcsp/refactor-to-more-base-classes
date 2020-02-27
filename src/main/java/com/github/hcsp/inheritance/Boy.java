package com.github.hcsp.inheritance;

import java.util.HashMap;

public class Boy extends Human {

    public Boy(String name, int age) {
        super(name, age);
    }

    public void sayBoy() {
        System.out.println("我是一个男孩");
    }
}

package com.github.hcsp.inheritance;

public class Biology {
    private String name;

    public Biology(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.print("我的名字是" + name);
    }
}

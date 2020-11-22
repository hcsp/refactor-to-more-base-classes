package com.github.hcsp.inheritance;

public class Organism {
    private String name;

    public Organism() {
    }

    public Organism(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}

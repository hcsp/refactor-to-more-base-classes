package com.github.hcsp.inheritance;

public class animal {
    private String name;

    public animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void sayMyName(){
        System.out.println("我的名字是" + name);
    }
    
    public void sound(){
        System.out.println();
    }
}

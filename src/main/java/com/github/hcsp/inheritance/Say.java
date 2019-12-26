package com.github.hcsp.inheritance;

/**
 * @author yaohengfeng
 * @version 1.0
 * @date 2019/12/26 16:31
 */
public class Say {
    private String name;

    public Say(String name) {
        this.name = name;
    }

    public Say() {
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

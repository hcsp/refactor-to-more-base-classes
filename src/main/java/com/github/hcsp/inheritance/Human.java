package com.github.hcsp.inheritance;

/**
 * @Author: GoFocus
 * @Date: 2020-03-23 14:30
 * @Description:
 */
public class Human extends Creature{
    protected int age;

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }


}

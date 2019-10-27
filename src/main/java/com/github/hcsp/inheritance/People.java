package com.github.hcsp.inheritance;

/**
 * @Auther:Lian
 * @Date:2019/10/27 16:30
 * @Description:TODO
 * @version:1.0
 */
public class People extends Biological {
    int age;

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}

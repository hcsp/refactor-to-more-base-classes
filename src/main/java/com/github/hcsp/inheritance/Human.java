package com.github.hcsp.inheritance;

public class Human extends Life{
    private int age;
    public Human(String nom, int aetas){
        super(nom);
        this.age=aetas;
    }
    public void sayMyAge(){
        System.out.println("我的年龄是"+age);
    }
    public void dire_sexe(String sexe){
        System.out.println("我是一个"+sexe);
    }
    public void sayMyName(){
        super.sayMyName();
    }
}

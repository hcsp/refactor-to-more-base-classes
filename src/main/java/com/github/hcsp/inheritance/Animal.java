package com.github.hcsp.inheritance;

public class Animal extends Life{
    public Animal(String name){
        super(name);
    }
    public void appeler(String son){
        System.out.println(son);
    }
    public void sayNyName(){
        super.sayMyName();
    }
}

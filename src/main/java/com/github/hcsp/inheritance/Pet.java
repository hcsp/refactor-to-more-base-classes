package com.github.hcsp.inheritance;

public class Pet {
   String name;
   public Pet(String PetName){
      name=PetName;
   }
   public void sayMyName() {
      System.out.println("我的名字是" + name);
   }
}

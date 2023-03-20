package com.github.hcsp.inheritance;

public class Person extends Intitle {
  private int age;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void sayMyAge() {
    System.out.println("我的年龄是" + age);
  }
}

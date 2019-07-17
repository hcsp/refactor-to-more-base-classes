package com.github.hcsp.inheritance;

public class Live {
  protected String name;
  public Live(String name) {
    this.name = name;
  }
  public void sayMyName() {
    System.out.println("我的名字是" + name);
  }
}

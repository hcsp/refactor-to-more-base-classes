package com.github.hcsp.inheritance;

public class Main {
    String name;
    int age;
    public Main(String name) {
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public Main(String name,int age) {
        this.name = name;
        this.age = age;
    }
    void sayMyName() {
        System.out.println("我的名字是" + name);
    }
    void sayMyAge() {
        System.out.println("我的年龄是" + getAge());
    }
    public static void main(String[] args) {
        Cat cat = new Cat("ABC");
        cat.meow();
        cat.sayMyName();

        Dog dog = new Dog("BCD");
        dog.wang();
        dog.sayMyName();

        Boy boy = new Boy("123", 2);
        boy.sayMyName();
        boy.sayMyAge();
        boy.sayBoy();

        Girl girl = new Girl("234", 3);
        girl.sayMyName();
        girl.sayMyAge();
        girl.sayGirl();
    }
}
   class Boy extends Main {
   Boy ( String name,int age ) {
       super(name,age);
    }
    void sayBoy() {

       System.out.println("我是一个男孩");
    }
}
   class Cat extends Main {
        Cat(String name) {
           super(name);
       }

       void meow() {
           System.out.println("喵");
       }
   }
  class Dog extends Main {
    Dog(String name) {
        super(name);
    }
    void wang() {
        System.out.println("汪");
    }
}
  class Girl extends Main {
      Girl(String name, int age) {
          super(name, age);
      }
      void sayGirl() {
          System.out.println("我是一个女孩");
      }
  }






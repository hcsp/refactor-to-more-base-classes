package com.github.hcsp.inheritance;

/**
 * @author qiaomengnan
 * @ClassName: People
 * @Description:
 * @date 2019-10-02
 */
public class People {

	protected String name;
	protected int age;

	public void sayMyName() {
		System.out.println("我的名字是" + name);
	}

	public void sayMyAge() {
		System.out.println("我的年龄是" + age);
	}

}

/**
 * 
 */
package com.github.hcsp.inheritance;

/**
 * @author sunp
 *
 */
public class Animal {

	private String name;

    /**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }

}

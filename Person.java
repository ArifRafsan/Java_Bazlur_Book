package com.rafsan.java;

public class Person {
	
	// 3 fields
	String name;
	int age;
	String mobile;
	
	//default constructor
	public Person() {
		
	}
	
	//parameterized constructor
	public Person(String name, int age, String mobile) {
		this.name = name;
		this.age = age;
		this.mobile = mobile;
	}
	
	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	//display method
	public void display() {
		System.out.println("NAME:"+name+ " AGE:"+age+" MOBILE:"+mobile);
	}
	
	public static void main(String [] args) {
		Person person1 = new Person("Arif", 25, "0182932****");
		Person person2 = new Person();
		
		person1.display();
		person2.display();
		
		
	}
}

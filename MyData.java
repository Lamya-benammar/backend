package com.stage.backend;

public class MyData {
	private String name;
	private int age;
	
	public MyData() {
		super();
	}
	
	public MyData(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
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
}

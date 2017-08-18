package com.tacademy.sam.vo;

public class Member {
	private String name;
	private int age;
	private String tel;
	
	
	public Member(){} //기본생성자
	
	public Member(String name, int age, String tel) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", tel=" + tel + "]";
	}
	
	
}

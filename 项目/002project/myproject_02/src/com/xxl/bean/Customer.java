package com.xxl.bean;

public class Customer {
	//属性
	private String name; //客户姓名
	private char gender;  //性别
	private int age;  //年龄
	private String phone;  //电话
	private String email;  //电子邮箱
	//构造器
	public Customer(){
		
	}
	public Customer(String name,char gender,int age,String phone,String email){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}
	//方法
	public String getName(){
		return name;
	}
	public char getGender(){
		return gender;
	}
	public int getAge(){
		return age;
	}
	public String getPhone(){
		return phone;
	}
	public String getEmail(){
		return email;
	}
	public void setGender(char name){
		this.gender = gender;
	}
	public void setAge(int name){
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public void setEmail(String email){
		this.email = email;
	}
}

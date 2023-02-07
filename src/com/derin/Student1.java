package com.derin;

public class Student1 
{
	private int no;
	private String name;
	private String sub;
	private String email;
	
	public Student1(int no, String name, String sub, String email)
	{
		super();
		this.no = no;
		this.name = name;
		this.sub = sub;
		this.email = email;
	}
	

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

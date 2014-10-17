package com.entity;

import com.opensymphony.xwork2.ActionSupport;

public class Author extends ActionSupport {
	String authorID;
	String name;
	String age;
	String country;
	public String getAuthorID() {
		return authorID;
		}
	public void setAuthorID(String authorID) {
		this.authorID = authorID;
		}
	public String getName() {
		return name;
		}
	public void setName(String name) {
		this.name = name;
		}
	public String getAge() {
		return age;
		}
	public void setAge(String age) {
		this.age = age;
		}
	public String getCountry() {
		return country;
		}
	public void setCountry(String country) {
		this.country = country;
		}
	
}

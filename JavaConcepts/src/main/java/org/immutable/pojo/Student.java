package org.immutable.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class Student {
	
	private final String name;
	private final int age;
	private final Date dob;
	private final List<Subject> marks;
	
	
	public Student(String name, int age, Date dob, List<Subject> marks) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Date getDob() {
		return new Date(dob.getTime());
	}
	public List<Subject> getMarks() {
		return new ArrayList<Subject>(marks);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", dob=" + dob + ", marks=" + marks + "]";
	}
	
	
	
	

}

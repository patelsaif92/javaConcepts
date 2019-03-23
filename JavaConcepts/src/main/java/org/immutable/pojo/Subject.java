package org.immutable.pojo;

public final class Subject {
	
	private final String subName;
	private final int marks;
	public Subject(String subName, int marks) {
		super();
		this.subName = subName;
		this.marks = marks;
	}
	public String getSubName() {
		return subName;
	}
	public int getMarks() {
		return marks;
	}
	@Override
	public String toString() {
		return "Subject [subName=" + subName + ", marks=" + marks + "]";
	}
	
}

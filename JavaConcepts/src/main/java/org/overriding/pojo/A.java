package org.overriding.pojo;

public class A {

	public static void main(String args[]) {
		B b = new C();
		b.display(); // invokes parent class method
		b.display1(); // invokes child class method
	}
}

abstract class B {
	{
		System.out.println("Block");
	}
	static {
		System.out.println("static");
	}

	B() {
		System.out.println("super");
	}

	static public void display() {
		System.out.println("B");
	}

	public void display1() {
		System.out.println("B");
	}
}

class C extends B {
	static public void display() {
		System.out.println("C");
	}

	public void display1() {
		System.out.println("C");
	}
}

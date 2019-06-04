package org.test;

public class MethodOverriding2 extends Methodoverriding {
	public void saving() {
		System.out.println("3%");

	}
	public void fixed() {
System.out.println("8%");
	}
	public static void main(String[] args) {
		MethodOverriding2 m=new MethodOverriding2();
		m.fixed();
		m.saving();
	m.deposite();
	}

}

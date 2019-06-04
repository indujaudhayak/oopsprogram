package org.test;

public class Methodoverloading {
	private void empid(String name) {
		System.out.println("String method"+name);
		

	}
	private void empid(String address,long phono) {
		System.out.println("\n2 method"+address+phono);
	}
	
	private void empid(int regno) {
		System.out.println("int method"+regno);
	}
	public static void main(String[] args) {
		
	
	Methodoverloading s=new Methodoverloading();
s.empid(1234);
s.empid("induja",9898998878l);
s.empid("trichy");

	}
	
		
	}




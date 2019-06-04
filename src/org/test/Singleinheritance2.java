package org.test;

public class Singleinheritance2 extends Sinhertance {
	public void empwork() {
		System.out.println("JAVA developer");

	}
	public void empsalery() {
		System.out.println("10000");
	}
public static void main(String[] args) {
	Singleinheritance2 s=new Singleinheritance2();
	s.empsalery();
	s.empwork();
	s.empid();
	s.empname();
}

}
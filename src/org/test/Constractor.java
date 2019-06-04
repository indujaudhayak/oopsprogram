package org.test;

public class Constractor {
	
	public Constractor() {
	
	System.out.println("san");

}
	public Constractor(int a) {
		
		System.out.println(a);

	}
	
	public static void main(String[] args) {
		Constractor c=new Constractor(12);
		Constractor c1=new Constractor();
	}
}
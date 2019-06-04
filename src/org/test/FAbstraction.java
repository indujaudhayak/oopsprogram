package org.test;

public  class FAbstraction implements Fullyabstaction {
	public void saving() {
System.out.println("1000");
	}
	public void deposite() {
		System.out.println("10000");

	}
	public void fixed() {
System.out.println("7%");
	}
	public static void main(String[] args) {
		FAbstraction f=new FAbstraction ();
		f.deposite();
		f.fixed();
		f.saving();
	}
	@Override
	public void policy() {
		
		
	}

}

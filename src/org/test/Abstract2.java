package org.test;

public class Abstract2 extends Absractclass{

	@Override
	public void Saving() {
		System.out.println("4");
		
	}

	@Override
	public void policy() {
		System.out.println("5");
		
	}

	@Override
	public void deposite() {
		System.out.println("10000");
		
	}
	public static void main(String[] args) {
		 Abstract2 a=new  Abstract2();
		 a.account();
		 a.deposite();
		 a.policy();
		 a.Saving();
	}

	
		
		
	
	

}

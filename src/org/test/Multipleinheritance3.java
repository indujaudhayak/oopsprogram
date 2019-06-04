package org.test;

public class Multipleinheritance3 implements Multipleinheritance1 ,Multipleinheritance2{

	@Override
	public void testName() {
		System.out.println("read");
		
	}

	@Override
	public void test5() {
System.out.println("write");		
	}

	@Override
	public void test1() {
System.out.println("update");		
	}

	@Override
	public void test2() {
System.out.println("multiple");		
	}

	@Override
	public void test3() {
System.out.println("5");		
	}
	public static void main(String[] args) {
		Multipleinheritance3 i=new Multipleinheritance3 ();
		i.test1();
		i.test2();
		i.test3();
		i.test5();
		
	}

}

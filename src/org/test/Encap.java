package org.test;

import java.util.ArrayList;
import java.util.List;

public class Encap {
	public static void main(String[] args) {
		
		List<Encapsulation> li =new ArrayList<>();
		
		Encapsulation e1=new Encapsulation();
		e1.setId(12345);
		e1.setAddress("trichy");
		e1.setName("induja");
		e1.setPhono(9786883375l);
		
		Encapsulation e2=new Encapsulation();
		e2.setId(123452);
		e2.setAddress("manaparai");
		e2.setName("priya");
		e2.setPhono(9786883375l);
		
		Encapsulation e3=new Encapsulation();
		e3.setId(123452);
		e3.setAddress("manaparai");
		e3.setName("priya");
		e3.setPhono(9786883375l);
		
		li.add(e1);
		li.add(e2);
		li.add(e3);
		
		
	for(int i=0;i<li.size();i++) {
		System.out.println("id is"+li.get(i).getId());
		System.out.println("name is"+li.get(i).getName());
		System.out.println("address is"+li.get(i).getAddress());
		System.out.println("phono is"+li.get(i).getPhono());
		
	}
		
	}

	

	private static void sysout(String string, Object getid) {
		// TODO Auto-generated method stub
		
	}

	private static Object getid() {
		// TODO Auto-generated method stub
		return null;
	}

}

package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo7 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(0);
		al.add(600);
		al.add(150);
		al.add(30);
		al.add(800);
		al.add(360);

		//Collections.sort(al);

		//Collections.reverse(al);
		//Collections.shuffle(al);
		//Collections.swap(al, 1, 3);
		
		
	 Iterator i=al.iterator();
	 while(i.hasNext())
	 {
		 System.out.println(i.next());
	 }
	}

}
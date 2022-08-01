package com.acharya.linkedlist;
import java.util.*;

public class Ex4 {

	public static void main(String[] args) {
		LinkedList<String> l= new LinkedList<>();
		l.add("Rama");
		l.add("Balu");
		l.add("Vikas");
		l.add("Danu");
		l.add("Vinay");
		System.out.println(l);
		String s = "Ravi";
		boolean b = l.contains(s);
		System.out.println(b);
		if(b)
		{
			System.out.println(l.indexOf(s));
		}
		

	}

}

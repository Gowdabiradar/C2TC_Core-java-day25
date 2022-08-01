package com.acharya.linkedlist;

import java.util.*;

public class Ex7 {

	public static void main(String[] args) {
		LinkedList st = new LinkedList();
		st.add("Vikas");
		st.add(9);
		st.add("Vishwa");
		st.add(6);
		System.out.println("Initial List is"+st);
		System.out.println("Head of the List: "+st.peek());
		System.out.println("Head of the List: "+st.peekFirst());
		System.out.println("Head of the List: "+st.peekLast());
		

	}

}
package com.acharya.collections;


import java.util.*;

public class Ex10 {

	public static void main(String[] args) {
		List <String> st = new ArrayList<>();
		st.add("Rama");
		st.add("Sita");
		st.add("Karna");
		st.add("Shanti");
		System.out.println(st);
		List s= st.subList(0, 2);
		System.out.println(s);
		

	}

}
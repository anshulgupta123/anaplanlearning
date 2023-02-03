package com.anaplane.java11.localvariablesyntax;

interface A {
	public String concat(String s1, String s2);
}

public class LocalVariableSyntax {

	public static void main(String[] args) {
		A a = (s1, s2) -> {
			return s1 + s2;
		};
		System.out.println(a.concat("ab", "cd"));

		A a1 = (String s1, String s2) -> {
			return s1 + s2;
		};
		System.out.println(a1.concat("ab", "cd"));

		A a2 = (var s1, var s2) -> {
			return s1 + s2;
		};
		System.out.println(a2.concat("ab", "cd"));

		// Error
//		A a3=(s1,var s2)-> {
//			return s1+s2;
//		};
//		System.out.println(a3.concat("ab", "cd"));
//		

		// Error
//		A a3=(var s1, s2)-> {
//			return s1+s2;
//		};
//		System.out.println(a3.concat("ab", "cd"));
//		

		
		
		
		
	}

}

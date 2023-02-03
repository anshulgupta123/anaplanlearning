package com.anaplane.java11.string;

public class DiffBwIsEmptyAndIsBlank {

	public static void main(String[] args) {
		
		String s="";
		System.out.println(s.isBlank());
		System.out.println(s.isEmpty());
		
		
		String s1="  ";
		System.out.println(s1.isBlank());
		System.out.println(s1.isEmpty());
		
		
		String s3="anshul";
		System.out.println(s3.isBlank());
		System.out.println(s3.isEmpty());
		
		String s2=null;
		System.out.println(s2.isBlank());
		System.out.println(s2.isEmpty());
		
		
		

	}

}

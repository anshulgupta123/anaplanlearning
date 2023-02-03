package com.anaplane.java11.string;

public class StripStringMethods {

	public static void main(String[] args) {
		
		String s="  anshul";
		String s2="anshul   ";
		String s3="  anshul  ";
		System.out.println(s.stripLeading());
		System.out.println(s2.stripTrailing());
		System.out.println(s3.strip());

	}

}

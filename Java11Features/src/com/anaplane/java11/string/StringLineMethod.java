package com.anaplane.java11.string;

import java.util.List;
import java.util.stream.Collectors;

public class StringLineMethod {
	public static void main(String[] args) {
          String s1="Hello\nHello\nAnshul";
          List<String> list =s1.lines().collect(Collectors.toList());
          for(String s:list) {
        	  System.out.println(s);
          }
	}
}

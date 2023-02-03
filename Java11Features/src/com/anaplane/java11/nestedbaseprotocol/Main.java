package com.anaplane.java11.nestedbaseprotocol;

public class Main {

	public void display() {
        System.out.println("Main class Display method"); 
	}

	class Nested {
		public void nestedDisplay() {
			display();
		}
	}

	public static void main(String[] args) {
        Main main= new Main();
        Main.Nested nested=main.new Nested();
        nested.nestedDisplay();
	}
}

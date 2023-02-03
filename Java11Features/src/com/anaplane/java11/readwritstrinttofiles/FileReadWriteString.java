package com.anaplane.java11.readwritstrinttofiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadWriteString {

	public static void main(String[] args) throws IOException {
		Path path = Files.writeString(Files.createTempFile("test", ".txt"), "Anaplan Platform Services");
		System.out.println(path);
		String s = Files.readString(path);
		System.out.println(s);
	}

}

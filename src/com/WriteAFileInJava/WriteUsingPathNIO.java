package com.WriteAFileInJava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteUsingPathNIO {

	// Path--> this also writes Byte [].

	public static void main(String[] args) {
		try {
			// String location = "WriteUsingPathNIO.txt";
			String location = "C:\\Users\\Prakash\\Documents\\FileHandling Files\\WriteUsingPathNIO.txt";
			String content = "I have to learn Some New Technology Related to Java.";

			byte Writing_In_WriteUsingPathNIO_File[] = content.getBytes();

			Path path = Paths.get(location);

			Files.write(path, Writing_In_WriteUsingPathNIO_File);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
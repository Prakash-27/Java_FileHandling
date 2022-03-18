package com.WriteAFileInJava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteUsingFileOutputStream {

	// FileOutputStream--> For writing raw bite Array information (eg.images).

	public static void main(String[] args) {

		 String location = "C:\\Users\\Prakash\\eclipse-workspace\\Java_File_Handling\\"
		 		+ "src\\com\\WriteAFileInJava\\WriteUsingFileOutputStream.txt";
		//String location = "C:\\Users\\Prakash\\Documents\\FileHandling Files\\WriteUsingFileOutputStream.txt";
		String content = "I Almost learned Core Java Concepts.";

		FileOutputStream fileOutputStream = null;

		try {
			fileOutputStream = new FileOutputStream(location);

			byte Writing_In_WriteUsingFileOutputStream_File[] = content.getBytes();

			fileOutputStream.write(Writing_In_WriteUsingFileOutputStream_File);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

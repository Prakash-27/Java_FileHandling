package com.WriteAFileInJava;

import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingFileWriter {

	// FileWriter-->Straight Forward, Direct interaction with files, less
	// Performance.

	public static void main(String[] args) {
		 String location = "C:\\Users\\Prakash\\eclipse-workspace\\Java_File_Handling\\"
		 		+ "src\\com\\WriteAFileInJava\\WriteUsingFileWriter.txt";
		//String location = "C:\\Users\\Prakash\\Documents\\FileHandling Files\\WriteUsingFileWriter.txt";
		String content = "Hello World!!! Iam Prakash!!! I Learning Java!!!";

		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter(location);

			fileWriter.write(content);

		} catch (IOException e) {
			e.printStackTrace(); 
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
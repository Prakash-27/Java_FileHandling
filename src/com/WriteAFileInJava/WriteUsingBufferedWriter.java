package com.WriteAFileInJava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingBufferedWriter {

	// BufferWriter--> Easiest way, performance wise better and widely used.

	public static void main(String[] args) {
		 String location = "C:\\Users\\Prakash\\eclipse-workspace\\Java_File_Handling\\"
		 		+ "src\\com\\WriteAFileInJava\\WriteUsingBufferedWriter.txt";
		//String location = "C:\\Users\\Prakash\\Documents\\FileHandling Files\\WriteFiles.txt";
		String content = "Can I able to Learn Java Programming.";

		BufferedWriter bufferedWriter = null;

		try {
			FileWriter fileWriter;
			fileWriter = new FileWriter(location);
			bufferedWriter = new BufferedWriter(fileWriter);

			bufferedWriter.write(content);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
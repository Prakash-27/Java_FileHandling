package com.OpenAndReadAFileInJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingBufferedReaderBy_readline_Method {

	public static void main(String[] args) {

		// String location = "ReadFileUsingBufferedReaderBy_readline_Method.txt";
		String location = "C:\\Users\\Prakash\\Documents\\FileHandling Files\\Prakash.txt";

		try {
			File file = new File(location);

			FileReader fileReader;

			fileReader = new FileReader(file);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String currentLine = bufferedReader.readLine();

			while ((currentLine = bufferedReader.readLine()) != null) {
				System.out.println(currentLine);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
package com.OpenAndReadAFileInJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingBufferedReader {

	public static void main(String[] args) {

		String path = "C:\\Users\\Prakash\\Documents\\FileHandling Files\\Prakash.txt";

		FileReader fileReader;
		
		BufferedReader br = null;

		try {
			File file = new File(path);

			fileReader = new FileReader(file);

			br = new BufferedReader(fileReader);

			System.out.println("File content is : ");

			int c = 0;
			while ((c = br.read()) != -1) {
				System.out.print((char) c);// Here if we give c mean it will print output in ASCI numbers So that we
											// have to give char with c.
			}

		} catch (Exception e) {
			// fip = new FileInputStream(file); throws FileNotFoundException.
			// read() throws IOException.
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

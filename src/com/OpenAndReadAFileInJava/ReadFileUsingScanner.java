package com.OpenAndReadAFileInJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileUsingScanner {

	public static void main(String[] args) {

		String path = "C:\\Users\\Prakash\\Documents\\FileHandling Files\\Prakash.txt";
		Scanner sc = null;
		try {
			File file = new File(path);
			sc = new Scanner(file);
			System.out.println("File content is: ");
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch( FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
		
	}
}

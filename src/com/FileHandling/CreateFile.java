package com.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateFile {

	/**
	 * Create a File in Java Using: 1.File 2.FileOutStream 3.Java NIO utils, we can
	 * use this Below three Approach to create a NewFile for all the types of
	 * Document like xml,csv,json,docx,xlsx etc....
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		System.out.println("-------------------Java File Creation using File io Package-----------------");

		String path = "C:\\Users\\Prakash\\Documents\\FileHandling Files\\sample.text";

		File file = new File(path);

		try {
			boolean newfileCreation = file.createNewFile();
			if (newfileCreation) {
				System.out.println("file is Created On FileHandling Files Folder.....");
			} else {
				System.out.println("file is Already Present On FileHandling Files Folder.....");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("--------------Java FileOutStream along with Scanner class File Creation-----------------");

		// 2. FileOutStream along with Scanner:

		// Scanner class is used to asked input from the user in commadLine or in Java
		// IDE console.
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the file name with location path: ");
			String fileName = sc.nextLine();

			FileOutputStream fileOutputstream = null;

			fileOutputstream = new FileOutputStream(fileName, true);

			System.out.println("Enter the file content: ");
			String content = sc.nextLine();
			byte b[] = content.getBytes();

			fileOutputstream.write(b);

			fileOutputstream.close();

			System.out.println("File is saved on the given location path");

		} catch (FileNotFoundException e2) {
			// This is for fileOutputstream = new FileOutputStream(fileName, true);
			// FileNotFoundException exception throws
			e2.printStackTrace();
		} catch (IOException e1) {
			// This is for fileoutputstream.write(b); and fileoutputstream.close();
			// IOException exception throws
			System.out.println("Some Exception is Coming......");
			e1.printStackTrace();
		}

		System.out.println("--------------Java nio package File Creation-----------------");

		// 3.Java nio package:

		Path pathLocation = Paths.get("C:\\Users\\Prakash\\Documents\\FileHandling Files\\Java NIO File.text");
		try {
			Path newPath = Files.createFile(pathLocation);
			System.out.println("new file created at : " + newPath);
		} catch (IOException e) {
			System.out.println("Some Exception is coming....");
			e.printStackTrace();
		}

	}
}

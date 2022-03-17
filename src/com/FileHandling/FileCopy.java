package com.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	/**
	 * File Handling - 1: Copy a File (pdf) and create a Different file in the same
	 * Location.
	 * 
	 * Copy of the file is created on File Handling Files
	 * @param args
	 */

	public static void main(String[] args) {

		String filepath = "C:\\Users\\Prakash\\Documents\\File Handling Files\\sample.pdf";
		String copyfilepath = "C:\\Users\\Prakash\\Documents\\File Handling Files\\sample-copy.pdf";
		
		File file = new File(filepath);
		File opfile = new File(copyfilepath);

		FileInputStream fileInputStream = null;
		FileOutputStream fileoutputStream = null;

		try {
			fileInputStream = new FileInputStream(file);
			fileoutputStream = new FileOutputStream(opfile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			System.out.println(fileInputStream.available());
		} catch (IOException e) {
			e.printStackTrace();
		}

		int i = 0;
		try {
			while ((i = fileInputStream.read()) != -1) {
				fileoutputStream.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			// close the streams:
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fileInputStream != null) {
				try {
					fileoutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

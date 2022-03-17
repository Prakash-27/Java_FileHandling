package com.OpenAndReadAFileInJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileUsingFileInputStream {

	public static void main(String[] args) {

		String path = "C:\\Users\\Prakash\\Documents\\FileHandling Files\\Prakash.txt";

		FileInputStream fip = null;
		try {

			File file = new File(path) ;

			fip = new FileInputStream(file);
			
			System.out.println("File content is : ");
			
			int c = 0;
			while((c = fip.read()) != -1) {
				System.out.print((char) c);//Here if we give c mean it will print output in ASCI numbers So that we have to give char with c. 
			}

		} catch (FileNotFoundException e) {
			//fip = new FileInputStream(file); throws FileNotFoundException.
			e.printStackTrace();
		} catch (IOException e) {
			//read() throws IOException.
			e.printStackTrace();
		}
		finally {
			try {
				fip.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}

package com.OpenAndReadAFileInJava;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {

	public static void main(String[] args) {

		String path = "C:\\Users\\Prakash\\Documents\\FileHandling Files\\Prakash.txt";
		FileReader fr = null; 
		try {
			fr = new FileReader(path);
			System.out.println("File content is : ");
			
			int c = 0;
			while((c = fr.read()) != -1) {
				System.out.print((char) c);//Here if we give c mean it will print output in ASCI numbers So that we have to give char with c. 
			}

		}catch (Exception e) {
			//fip = new FileInputStream(file); throws FileNotFoundException.
			//read() throws IOException.
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
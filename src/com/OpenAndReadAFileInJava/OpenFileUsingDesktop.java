package com.OpenAndReadAFileInJava;

import java.io.File;


public class OpenFileUsingDesktop {

	public static void main(String[] args) {

		//I don't know Why java awt package is not working on the Eclipse. here Destop is Awt package. 
		//In My Machine Deskop Interface is not Working. so total program is not Running.
		
		String path = "C:\\Users\\Prakash\\Documents\\FileHandling Files\\Prakash.text";
		try {
			File file = new File(path);

//			if (!Desktop.isDesktopSupported()) {
//				System.out.println("Desktop not supported");
//				return;
//			}

//			Desktop desktop = Desktop.getDesktop();

			if (file.exists()) {
//				desktop.open(file);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

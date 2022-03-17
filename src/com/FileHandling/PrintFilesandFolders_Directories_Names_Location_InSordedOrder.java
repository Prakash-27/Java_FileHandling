package com.FileHandling;

import java.io.File;
import java.util.Arrays;

public class PrintFilesandFolders_Directories_Names_Location_InSordedOrder {

	/**
	 * print all files and folders in a directory in sorted order.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		String path = "C:\\Users\\Prakash\\Documents";

		File file = new File(path);

		File downloadDir[] = file.listFiles();

		Arrays.sort(downloadDir);

		for (File e : downloadDir) {

			if (e.isFile()) {
				System.out.println("File : " + e.getName() + " ---> " + e.getAbsolutePath());
			} else if (e.isDirectory()) {
				System.out.println("Directory : " + e.getName() + " ---> " + e.getAbsolutePath());
			} else {
				System.out.println("Not Known : " + e.getName() + " ---> " + e.getAbsolutePath());
			}

		}

	}

}

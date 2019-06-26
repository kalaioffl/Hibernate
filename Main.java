package com.gits.Hibernate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		String fileName = "data.csv";
		File file = new File (fileName);
		try {
			Scanner inputStream = new Scanner(file);
			while (inputStream.hasNext()) {
				String data = inputStream.next();
				
				System.out.println(data+" ");
				}
			inputStream.close();
			
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		}
	}

}

package com.atmecs.automation_demo.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class PropertyReader {

	public static Properties properties;

	public static Properties readProperty(String path) 
	{
		properties=new Properties();
		try {
			properties.load(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			System.out.println("File not found Exception" + e.getMessage());


		} catch (IOException e) {
			System.out.println("IO Exception " + e.getMessage());

		}
		return properties;
	}

}

package com.adactin.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader { // using static class variable we can use the LV or constructor method inside
									// the program

	public static Properties pro; // to call the method inside the program,

	public Configuration_Reader() throws Throwable { // create constructor

		File f = new File(
				"C:\\Users\\Welcome\\eclipse-workspace\\Adactin\\src\\test\\java\\com\\adactin\\configuration\\Adactin.Properties");
		FileInputStream fis = new FileInputStream(f);// class
		pro = new Properties(); // class and remove the properties class once create static variable Properties
								// pro = new Properties()
		pro.load(fis);

	}

	public String getBrowser() {
		String browser = pro.getProperty("browser");
		return browser;
		// we came for this concept to keep object as single instance, instead of
		// creating multiple object
	}

	public String getUrl() {
		String url = pro.getProperty("url");
		return url;
	}
}

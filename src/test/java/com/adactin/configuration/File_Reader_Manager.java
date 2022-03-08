package com.adactin.configuration;

public class File_Reader_Manager { // 3.step to avoid further obj.cr for File_R_M class in any class we create
									// empty constructor for File_R_M as private
									// becz.constructor name and class names are same
	private File_Reader_Manager() {

	}

	public static File_Reader_Manager getInstance() { // 2.step to create object for File_R_M class ,use static to call
														// the method getInstanceCR
		File_Reader_Manager helper = new File_Reader_Manager();
		return helper;

	}

	public Configuration_Reader getInstanceCR() throws Throwable { // 1.step to get browser and url in CR class we
																	// create method as getInstanceCR in this class
		Configuration_Reader reader = new Configuration_Reader();
		return reader;

	}

}

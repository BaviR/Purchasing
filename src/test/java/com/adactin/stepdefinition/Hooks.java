package com.adactin.stepdefinition;



import com.adactin.org.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hooks extends BaseClass {
	
	@Before
	public void beforehooks(Scenario scenario) {
	String name = scenario.getName();    //ctrl 2
		System.out.println("scenario name :" + name);
		
	}
	@After
	public void afterhooks(Scenario scenario) throws Throwable  {
		Status status = scenario.getStatus();
	    System.out.println("scenario status :" + status);
		if (scenario.isFailed()) {
			screenshot("C:\\Users\\Welcome\\eclipse-workspace\\Adactin\\Screensho\\img.png");
			
		}

	}
	
	
	
	
	
	
	
}

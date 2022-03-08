package com.adactin.runner;

import javax.swing.text.html.HTML;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.adactin.configuration.File_Reader_Manager;
import com.adactin.org.BaseClass;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", glue = "com\\adactin\\stepdefinition", 
monochrome = true)

public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws Throwable {
		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		driver = BaseClass.getdriver(browser);
		
	}

}

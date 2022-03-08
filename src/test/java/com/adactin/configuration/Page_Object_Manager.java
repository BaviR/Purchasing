package com.adactin.configuration;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.Book_Hotel;
import com.adactin.pom.LoginPage;
import com.adactin.pom.Search_Hotel;
import com.adactin.pom.Select_Hotel;

public class Page_Object_Manager {
	
	public static WebDriver driver;
	
	private LoginPage lp;
	private Search_Hotel sh;
	private Select_Hotel sh1;
	private Book_Hotel bh;
	
   public Page_Object_Manager(WebDriver driver2) {
	   this.driver = driver2;
		
	}
	  
  

   
   
   
	
	 public LoginPage getInstanceLoginPage() { LoginPage lp = new
	 LoginPage(driver);
	 return lp;
	
}
   public Search_Hotel getInstanceSearch_Hotel() {
      Search_Hotel sh = new Search_Hotel(driver);
      return sh;
      }
    public Select_Hotel getInstanceSelect_Hotel() {
		Select_Hotel sh1 = new Select_Hotel(driver);
		return sh1;
		
	}   
    public Book_Hotel getInstanceBook_Hotel() {
		Book_Hotel bh = new Book_Hotel(driver);
		return bh;

	}
   
}

 
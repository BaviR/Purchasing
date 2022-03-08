package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public static WebDriver driver;
	
	
	
	@FindBy(name ="location")
	private WebElement location;
	
	@FindBy(id ="hotels")
	private WebElement hotels;
	
	@FindBy(id ="room_type")
	private WebElement roomtype;
	
	@FindBy(name ="room_nos")
    private WebElement numberofroom;
	
	@FindBy(xpath ="//input[@name='datepick_in']")
	private WebElement checkindate;
	
	@FindBy(xpath ="//input[@name='datepick_out']")
	private WebElement checkoutdate;
	
	@FindBy(id ="adult_room")
	private WebElement noofadults;
	
	@FindBy(xpath ="//input[@type='submit']")
	private WebElement submit;

	

	public Search_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumberofroom() {
		return numberofroom;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getNoofadults() {
		return noofadults;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
}

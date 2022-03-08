package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.adactin.configuration.File_Reader_Manager;
import com.adactin.configuration.Page_Object_Manager;
import com.adactin.org.BaseClass;
import com.adactin.runner.Runner;
import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = Runner.driver;

	Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("^user want to launch the adactin application$")
	public void user_want_to_launch_the_adactin_application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		getUrl(url);
	}

	@When("user want to enter {string} valid username")
	public void user_want_to_enter_valid_username(String string) {
		inputValue(pom.getInstanceLoginPage().getUsername(), string); // exception throws parameter string
	}

	@When("user want to enter {string} valid password")
	public void user_want_to_enter_valid_password(String string) {
		inputValue(pom.getInstanceLoginPage().getPassword(), string);

	}

	@Then("^user verify the valid username and password$")
	public void user_verify_the_valid_username_and_password() throws Throwable {
		click(pom.getInstanceLoginPage().getLogin());
	}

	// Search_Hotel sh = new Search_Hotel(driver);

	@When("user want to select the hotel location")
	public void user_want_to_select_the_hotel_location() {
		dropdown(pom.getInstanceSearch_Hotel().getLocation(), "byVisibleText", "Sydney");
	}

	@When("user want to select the hotel")
	public void user_want_to_select_the_hotel() {
		dropdown(pom.getInstanceSearch_Hotel().getHotels(), "byVisibleText", "Hotel Sunshine");
	}

	@When("user want to select the room type")
	public void user_want_to_select_the_room_type() {
		dropdown(pom.getInstanceSearch_Hotel().getRoomtype(), "byValue", "Standard");
	}

	@When("user want to  select number of rooms")
	public void user_want_to_select_number_of_rooms() {
		dropdown(pom.getInstanceSearch_Hotel().getNumberofroom(), "byVisibleText", "2 - Two");
	}

	@When("user want to  select the checkin date")
	public void user_want_to_select_the_checkin_date() {
		clear(pom.getInstanceSearch_Hotel().getCheckindate());
		inputValue(pom.getInstanceSearch_Hotel().getCheckindate(), "12/10/2021");
	}

	@When("user want to select the checkout date")
	public void user_want_to_select_the_checkout_date() {
		clear(pom.getInstanceSearch_Hotel().getCheckoutdate());
		inputValue(pom.getInstanceSearch_Hotel().getCheckoutdate(), "13/10/2021");
	}

	@When("user want to select the adults per room")
	public void user_want_to_select_the_adults_per_room() {
		dropdown(pom.getInstanceSearch_Hotel().getNoofadults(), "byVisibleText", "2 - Two");
	}

	@Then("user want to verify the valid username and password")
	public void user_want_to_verify_the_valid_username_and_password() {
		click(pom.getInstanceSearch_Hotel().getSubmit());
	}

	// Select_Hotel sh1 = new Select_Hotel(driver);

	@When("user want to click the selected hotel")
	public void user_want_to_click_the_selected_hotel() {
		click(pom.getInstanceSelect_Hotel().getRadiobutton());
	}

	@When("user want the confirm the hotel")
	public void user_want_the_confirm_the_hotel() {
		click(pom.getInstanceSelect_Hotel().getSubmit());
	}

	// Book_Hotel bh = new Book_Hotel(driver);

	@When("user want to enter the firstname")
	public void user_want_to_enter_the_firstname() {
		inputValue(pom.getInstanceBook_Hotel().getFirstname(), "Bavithra");

	}

	@When("user want to enter the lastname")
	public void user_want_to_enter_the_lastname() {
		inputValue(pom.getInstanceBook_Hotel().getLastname(), "R");
	}

	@When("user want to enter the billing address")
	public void user_want_to_enter_the_billing_address() {
		inputValue(pom.getInstanceBook_Hotel().getAddress(), "no42 arignar anna street chennai85");

	}

	@When("user want to enter the credit card number")
	public void user_want_to_enter_the_credit_card_number() {
		inputValue(pom.getInstanceBook_Hotel().getCreditcardnumber(), "1567 3456 2345 6789");
	}

	@When("user want to enter the credit card type")
	public void user_want_to_enter_the_credit_card_type() {
		inputValue(pom.getInstanceBook_Hotel().getCardtype(), "American Express");
	}

	@When("user want to enter the expiry month")
	public void user_want_to_enter_the_expiry_month() {
		dropdown(pom.getInstanceBook_Hotel().getExpmonth(), "byVisibleText", "March");
	}

	@When("user want to enter the expiry year")
	public void user_want_to_enter_the_expiry_year() {
		dropdown(pom.getInstanceBook_Hotel().getExpyear(), "byVisibleText", "2022");
	}

	@When("user want to enter the cvv number")
	public void user_want_to_enter_the_cvv_number() {
		inputValue(pom.getInstanceBook_Hotel().getCvv(), "432");
	}

	@When("user want to book the hotel")
	public void user_want_to_book_the_hotel() {
		click(pom.getInstanceBook_Hotel().getBooknow());
	}

}

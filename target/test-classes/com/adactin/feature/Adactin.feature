Feature: Hotel Booking Functionality 
@Login @HotelBooked
Scenario Outline: user want to login the application 
	Given  user want to launch the adactin application 
	When  user want to enter "<UserName>" valid username 
	And user want to enter "<Password>" valid password 
	Then user verify the valid username and password 
	
	Examples: 
		|UserName|Password|
		|AAA|123|
		|BBB|456|
		|CCC|789|
		
@Login 
Scenario: user want to login the application 
	Given  user want to launch the adactin application 
	When  user want to enter "Baviraghu" valid username 
	And user want to enter "bavi@141594" valid password 
	Then user verify the valid username and password 
	
@HotelBooked
Scenario: User want to search the hotel 
	When user want to select the hotel location 
	And user want to select the hotel 
	And user want to select the room type 
	And user want to  select number of rooms 
	And user want to  select the checkin date 
	And user want to select the checkout date 
	And user want to select the adults per room 
	Then user want to verify the valid username and password 
	
Scenario: user want to select the hotel 
	When user want to click the selected hotel 
	And user want the confirm the hotel 
	
	
Scenario: user want to book the hotel 
	When user want to enter the firstname 
	And user want to enter the lastname 
	And user want to enter the billing address 
	And user want to enter the credit card number 
	And user want to enter the credit card type 
	And user want to enter the expiry month 
	And user want to enter the expiry year 
	And user want to enter the cvv number 
	And user want to book the hotel 

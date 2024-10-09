@page1
Feature: Book the hotel using Adactin hotel application

Scenario: To login using valid username and valid password
Given To launch the chrome browser and hit the url

When To send the valaid user name

And To send the valaid password

And To click the adactic login button

@page2
Scenario: To search the location and select rooms for hotel booking

When Select location

And select rooms

And To click the adactic search button

@page3
Scenario: To Select the hotel and continue

When Select the hotel using radio button

And To click the continue button


@page4
Scenario: Fill the form detail to book the hotel

When Enter first name

And Enter last name

And Enter billing address

And Enter credit card number

And Select credit card type

And Select expiry month 

And Select expiry year

And Enter Cvv number

And To click the book now button

@page5
Scenario: View the booking deatil

When Click My itinerary

Then To print  search information in console




 

package org.stepdefinition;

import java.awt.AWTException;

import org.adactinpojo.AdactinBookHotelPojo4;
import org.adactinpojo.AdactinBookingConfirmationpojo5;
import org.adactinpojo.AdactinHotelLoginPojo1;
import org.adactinpojo.AdactinSearchHotelPojo2;
import org.adactinpojo.AdactinSelectHotelpojo3;
import org.baseclass.BaseClass;

import io.cucumber.java.en.*;

public class AdactinLoginPage1 extends BaseClass{
	
public static  AdactinHotelLoginPojo1 a ;

public static AdactinSearchHotelPojo2 a1;

public static AdactinSelectHotelpojo3 a3;

public static  AdactinBookHotelPojo4 a4;


@Given("To launch the chrome browser and hit the url")
public void to_launch_the_chrome_browser_and_hit_the_url() {
	browserLaunch();
    getUrl("https://adactinhotelapp.com/");
    maxWindow();

}

@When("To send the valaid user name")
public void to_send_the_valaid_user_name() {
	a=new AdactinHotelLoginPojo1();
fillTextBox(a.getEmailText(), "bhavyavijay");}

@When("To send the valaid password")
public void to_send_the_valaid_password() {
    fillTextBox(a.getPasswordText(), "bhavya@123");
}

@When("To click the adactic login button")
public void to_click_the_adactic_login_button() {
    buttonClick(a.getLogin());
}




@When("Select location")
public void select_location() throws AWTException {
	a1=new AdactinSearchHotelPojo2();
    buttonClick(a1.getLocation());
    down();
	down();
    enter();
}

@When("select rooms")
public void select_rooms() throws AWTException {
	a1=new AdactinSearchHotelPojo2();

    buttonClick(a1.getRoom());
	down();
    enter();
}

@When("To click the adactic search button")
public void to_click_the_adactic_search_button() {
	a1=new AdactinSearchHotelPojo2();

    buttonClick(a1.getSearch());
}

@When("Select the hotel using radio button")
public void select_the_hotel_using_radio_button() {
     a3=new AdactinSelectHotelpojo3();
     buttonClick(a3.getHotel());
}

@When("To click the continue button")
public void to_click_the_continue_button() {
    a3=new AdactinSelectHotelpojo3();
    buttonClick(a3.getContinew());
}



@When("Enter first name")
public void enter_first_name() {
    a4=new AdactinBookHotelPojo4();
    fillTextBox(a4.getFirstName(), "bhavya");
}

@When("Enter last name")
public void enter_last_name() {
    a4=new AdactinBookHotelPojo4();
    fillTextBox(a4.getLastName(), "vijay");

}

@When("Enter billing address")
public void enter_billing_address() {
	a4=new AdactinBookHotelPojo4();
    fillTextBox(a4.getAddress(), "No.803,ganapathy,Coimbatore 641006");
}

@When("Enter credit card number")
public void enter_credit_card_number() {
	a4=new AdactinBookHotelPojo4();
    fillTextBox(a4.getCcNumber(), "6123456789087654");
}

@When("Select credit card type")
public void select_credit_card_type() throws AWTException {
	a4=new AdactinBookHotelPojo4();
    buttonClick(a4.getCcType());
    down();
    down();
    enter();
}

@When("Select expiry month")
public void select_expiry_month() throws AWTException {
	a4=new AdactinBookHotelPojo4();
    buttonClick(a4.getCcExpMonth());
	down();
    down();
    enter();
}

@When("Select expiry year")
public void select_expiry_year() {
	a4=new AdactinBookHotelPojo4();
    buttonClick(a4.getCcExpYear());
    buttonClick(a4.getYear());
}

@When("Enter Cvv number")
public void enter_Cvv_number() {
	a4=new AdactinBookHotelPojo4();

    fillTextBox(a4.getcVV(), "222");
}

@When("To click the book now button")
public void to_click_the_book_now_button() {
	a4=new AdactinBookHotelPojo4();
buttonClick(a4.getBookNow());
}


@When("Click My itinerary")
public void click_My_itinerary() throws InterruptedException {
	sleep();
	
    AdactinBookingConfirmationpojo5 a5=new AdactinBookingConfirmationpojo5();
    buttonClick(a5.getDetails());
}


@Then("To print  search information in console")
public void to_print_search_information_in_console() {
    System.out.println("Hotel Booking successfull");
}






}

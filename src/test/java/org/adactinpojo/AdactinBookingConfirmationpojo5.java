package org.adactinpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdactinBookingConfirmationpojo5 extends AdactinHotelLoginPojo1 {

	@FindBy(xpath="//input[@id='my_itinerary']")
	public WebElement details;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/input")
	public WebElement orderNumber;

	public WebElement getDetails() {
		return details;
	}
	
	public WebElement getorderNumber() {
		return orderNumber;
	}
	
	
}

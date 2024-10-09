package org.adactinpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdactinSearchHotelPojo2 extends AdactinHotelLoginPojo1 {

	@FindBy(id="location")
	public WebElement location;
	
	@FindBy(id="room_nos")
	public WebElement room;
	
	@FindBy(id="Submit")
	public WebElement search;

	

	public WebElement getSearch() {
		return search;
	}
    public WebElement getRoom() {
		return room;
	}
    public WebElement getLocation() {
		return location;
	
	}
}
		


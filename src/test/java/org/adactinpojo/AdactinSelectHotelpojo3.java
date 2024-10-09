package org.adactinpojo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdactinSelectHotelpojo3 extends AdactinSearchHotelPojo2 {
	
@FindBy(id="radiobutton_1")
public WebElement hotel;

@FindBy(id="continue")
public WebElement continew;

public WebElement getHotel() {
	return hotel;
}

public WebElement getContinew() {
	return continew;
}


}

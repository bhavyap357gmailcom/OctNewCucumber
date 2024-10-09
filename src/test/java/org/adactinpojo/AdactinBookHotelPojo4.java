package org.adactinpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdactinBookHotelPojo4 extends AdactinHotelLoginPojo1 {
	@FindBy(name="first_name")
	public WebElement firstName;
	
	@FindBy(name="last_name")
	public WebElement lastName;
	
	@FindBy(name="address")
	public WebElement address;
	
	@FindBy(id="cc_num")
	public WebElement ccNumber;
	
	@FindBy(id="cc_type")
	public WebElement ccType;
	
	@FindBy(id="cc_exp_month")
	public WebElement ccExpMonth;
	
	@FindBy(xpath="//option[text()='2025']")
	public WebElement Year;
	
	@FindBy(id="cc_exp_year")
	public WebElement ccExpYear;
	
	@FindBy(id="cc_cvv")
	public WebElement cVV;
	
	@FindBy(id="book_now")
	public WebElement bookNow;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNumber() {
		return ccNumber;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcExpMonth() {
		return ccExpMonth;
	}

	public WebElement getCcExpYear() {
		return ccExpYear;
	}
	
	public WebElement getYear() {
		return Year;
	}

	public WebElement getcVV() {
		return cVV;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
	
	
	}

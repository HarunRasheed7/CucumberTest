package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.commonaction.CommonAction;

public class PageObjectTarriff extends CommonAction {
public PageObjectTarriff() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='Add Tariff Plan']")
private WebElement addtariff;

@FindBy(id="rental1")
private WebElement rental;

@FindBy(id="local_minutes")
private WebElement localmin;

@FindBy(id="inter_minutes")
private WebElement intermin;

@FindBy(id="sms_pack")
private WebElement smspack;

@FindBy(id="minutes_charges")
private WebElement mincharge;

@FindBy(id="inter_charges")
private WebElement intercharge;

@FindBy(id="sms_charges")
private WebElement smscharge;

@FindBy(name="submit")
private WebElement submit;

public WebElement getAddtariff() {
	return addtariff;
}

public WebElement getRental() {
	return rental;
}

public WebElement getLocalmin() {
	return localmin;
}

public WebElement getIntermin() {
	return intermin;
}

public WebElement getSmspack() {
	return smspack;
}

public WebElement getMincharge() {
	return mincharge;
}

public WebElement getIntercharge() {
	return intercharge;
}

public WebElement getSmscharge() {
	return smscharge;
}

public WebElement getSubmit() {
	return submit;
}


	
}



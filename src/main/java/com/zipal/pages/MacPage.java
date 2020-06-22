package com.zipal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zipal.base.TestBase;

public class MacPage extends TestBase
{
	
	
	@FindBy(xpath="//div/h2[text()='Mac']")
	WebElement page_Mac;

	@FindBy(xpath="//a[text()='iMac']")
	WebElement item_iMac;

	@FindBy(xpath="//a[text()='iMac']/../following-sibling::p[@class='price']")
	 WebElement item_iMacUnitPrice;

	@FindBy(xpath="//a[text()='iPhone']/../following-sibling::p[@class='price']")
	WebElement item_iPhoneUnitPrice ;
	
	@FindBy(xpath="//a[text()='iMac']/../../following-sibling::div/..//span[text()='Add to Cart']")
	WebElement item_iMac_addtocart;
	
	@FindBy(xpath="//div[@class='list-group']//a[contains(text(),'Phones & PDAs')]")
	WebElement list_PhoneandPDAs;
	
	public MacPage()
	{
		PageFactory.initElements(driver, this);
	} 
	
	public String getTextMacPage()
	{
		String text= page_Mac.getText();
		return text;
	}
	
	public boolean checkLinkPhoneAndPDAs()
	{
		boolean isPresent = list_PhoneandPDAs.isDisplayed();
		return isPresent;
	}
	
	public void navigateToPhonesAndPDAsPage()
	{
		list_PhoneandPDAs.click();
	}
	
	public int quantityShowingOnLink()
	{
		int quantity=Integer.parseInt(list_PhoneandPDAs.getText().replaceAll("[^0-9]", ""));
		return quantity;
	}

}

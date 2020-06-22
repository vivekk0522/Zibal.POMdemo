package com.zipal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zipal.base.TestBase;

public class HomePage extends TestBase
{

	
	
	@FindBy(xpath="//a[text()='Desktops']")
	WebElement tab_Desktops;
	
	@FindBy(xpath="//a[text()='Desktops']/..//a[contains(text(),'Mac')]")
	WebElement Mac;
	
	@FindBy(xpath="//a[text()='Phones & PDAs']")
	WebElement tab_PhonesandPDAs;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void moveToDesktopsTab()
	{
		Actions action = new Actions(driver);
		action.moveToElement(tab_Desktops).build().perform();;
	}
	
	public void moveToMacOption()
	{
		Actions action = new Actions(driver);
		action.moveToElement(Mac).build().perform();
	}
	
	public void selectMacOption()
	{
		Actions action = new Actions(driver);
		action.moveToElement(Mac).click().build().perform();
	}
	
	public String getTextofMac()
	{
		Actions action = new Actions(driver);
		action.moveToElement(Mac).build().perform();
		String text= Mac.getText().replaceAll("[^\\w\\d[0-9]]", "");
		return text;
	}
	
	
}

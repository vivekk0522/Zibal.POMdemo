package com.zipal.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zipal.base.TestBase;

public class PhoneAndPDAs extends TestBase
{
	
	
	
	@FindBy(xpath="//div[@class='row']/div[contains(@class,'product')]")
	  List<WebElement> availbale_products;	
	
	@FindBy(xpath="//a[text()='iPhone']/../../following-sibling::div/..//span[text()='Add to Cart']")
	 WebElement item_iphone_addtocart;
	
	public PhoneAndPDAs()
	{
		PageFactory.initElements(driver, this);
	} 
	
	
	
	public int numberOfProductsShowing()
	{
		List<WebElement> list= availbale_products;
		int items= list.size() ;
		return items;
	}

}

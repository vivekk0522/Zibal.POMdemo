package com.zipal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage 
{
	
	@FindBy(xpath="//div[contains(@class,'table')]/..//a[text()='iMac']")
	  WebElement shopping_cartpage_item_iMac;

	@FindBy(xpath="//div[contains(@class,'table')]/..//a[text()='iPhone']")
	WebElement shopping_cartpage_item_iPhone;
	
	@FindBy(xpath="//form/..//a[contains(text(),'iMac')]/../following-sibling::td//div//input")
	  WebElement quantity_field_ofiMac;
	
	@FindBy(xpath="//form/..//a[contains(text(),'iMac')]/../following-sibling::td/..//button[@data-original-title='Update']")
	  WebElement item_update_button_iMac;
	
	@FindBy(xpath="//form/..//a[contains(text(),'iPhone')]/../following-sibling::td/..//button[@data-original-title='Remove']")
	  WebElement item_remove_button_iPhone;
	
	@FindBy(xpath="//i[contains(@class,'check')]/..")
	  WebElement item_update_message;

}

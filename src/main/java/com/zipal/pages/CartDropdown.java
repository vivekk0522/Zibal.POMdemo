package com.zipal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartDropdown 
{
	
	@FindBy(xpath="//div[@id='cart']//button//span/..")
	 private WebElement shopping_cartdrpdwn;

	@FindBy(xpath="//ul[contains(@class,'dropdown')]/..//a[text()='iPhone']")
	  WebElement shopping_cartdrpdw_item_iPhone;
	
	@FindBy(xpath="//ul[contains(@class,'dropdown')]/..//a[text()='iPhone']/../../td[@class='text-right']")
	  WebElement shopping_cart_item_iPhone_qtyprice;
	
	@FindBy(xpath="//ul[contains(@class,'dropdown')]/..//a[text()='iMac']")
	  WebElement shopping_cartdrpdw_item_iMac;

	@FindBy(xpath="//ul[contains(@class,'dropdown')]/..//a[text()='iMac']/../../td[@class='text-right']")
	  WebElement shopping_cart_item_iMac_qtyprice;
	
	@FindBy(xpath="//strong[text()=' View Cart']")
	 WebElement view_cart;

}

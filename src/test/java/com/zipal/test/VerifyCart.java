package com.zipal.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.zipal.base.TestBase;
import com.zipal.pages.HomePage;
import com.zipal.pages.MacPage;
import com.zipal.pages.PhoneAndPDAs;


public class VerifyCart extends TestBase
{
	static HomePage homepage;
	static MacPage macpage;
	static PhoneAndPDAs phonepdas;
	@BeforeTest
	public void beforeMethod()
	{
		TestBase.launchBrowser();
	}
	
	@AfterTest
	public void afterMethod()
	{
		TestBase.closeBrowser();
	}
	
	@Test
	public void verifyPage()
	{
		homepage= new HomePage();
		macpage= new MacPage();
		
		
		homepage.moveToDesktopsTab();
		homepage.moveToMacOption();
		String text_Mac=homepage.getTextofMac();
		homepage.selectMacOption();
		
		
		String text_MacPage=macpage.getTextMacPage();
		Assert.assertTrue(text_MacPage.equals(text_Mac));
		Reporter.log("Page verified");
	}
	
	@Test(dependsOnMethods="verifyPage")
	public void verifyLink()
	{
		Assert.assertTrue(macpage.checkLinkPhoneAndPDAs());
		Reporter.log("Link present");
	}
	
	@Test(dependsOnMethods="verifyPage")
	public void verifyProductsOnPhonesAndPDAsPage()
	{
		phonepdas=new PhoneAndPDAs();
		macpage.navigateToPhonesAndPDAsPage();
		int products_showing_onpage=phonepdas.numberOfProductsShowing();
		Assert.assertTrue(macpage.quantityShowingOnLink()==products_showing_onpage);
		Reporter.log("Number of products getting displayed on page are correct");
		
	}
}

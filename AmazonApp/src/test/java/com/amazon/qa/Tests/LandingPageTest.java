package com.amazon.qa.Tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.Pages.LandingPage;
import com.amazon.qa.TestBase.TestBase;

public class LandingPageTest extends TestBase{
	LandingPage landingpage;
	public LandingPageTest() {
		super();
	}
@BeforeMethod
public void setup() {
	initialization();
	landingpage = new LandingPage();
}
@Test(priority=1)
public void ValidateTitle() {
	/*String Title = landingpage.ValidateTitle();
	Assert.assertEquals(Title, prop.getProperty(Title));*/
	boolean b= landingpage.ValidateSearchBox();
	Assert.assertTrue(b);
}
@Test(priority=3)
public void GetTitle() {
	String title=landingpage.Gettitle();
	System.out.println(title);
	Assert.assertEquals(title,prop.getProperty("Title"));
}
@Test(priority=2)
public void HighestPricedPhone() {
	landingpage.SearchProduct();
}

@Test(priority=4)
/*public void SelectPhone() {
	WebElement phone=landingpage.SearchProduct();
	phone.click();
}*/

@AfterMethod
public void Teardown() {
	driver.quit();
}
}

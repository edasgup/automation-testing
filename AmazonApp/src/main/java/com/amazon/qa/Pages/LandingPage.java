package com.amazon.qa.Pages;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.TestBase.TestBase;

public class LandingPage extends TestBase {

//PageFactory
	@FindBy(id="nav-logo-sprites")
	WebElement logo;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement SearchBox;
	
	@FindBy(xpath="//span[@class='a-price-whole']")
	String ProductLists;
	
	//initializing PageObject
	public LandingPage() {
		PageFactory.initElements(driver, this);
		
	}
	public boolean ValidateSearchBox() {
		/*String Logo = logo.getText();
		return Logo;*/
		return SearchBox.isEnabled();
	}
	
	
	 public void SearchProduct() {
		/* SearchBox.sendKeys(prop.getProperty("product"));}
		 HashMap<Integer,String> map= new HashMap<>();
		  List<WebElement> ProductList= driver.findElements(By.xpath(ProductLists));
		  if(ProductList.size()!=0) {
		 String largest = ProductList.get(0).getText();
		 int lar= Integer.parseInt(largest);
		 for(int i=0;i<ProductList.size();i++) {
			 String SecondLARGE=ProductList.get(i).getText();
			 int secl=Integer.parseInt(SecondLARGE);
		 if (lar>secl) {
			 lar=secl;
					 } */
		 }
	public String Gettitle() {
		return driver.getTitle();}
	}
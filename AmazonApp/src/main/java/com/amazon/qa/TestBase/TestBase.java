package com.amazon.qa.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.qa.Testutils.TestUtils;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public TestBase(){
		try {
			prop=new Properties();
			FileInputStream ip= new FileInputStream("C:\\Projects\\AmazonApp\\src\\main\\java\\com\\amazon\\qa\\config\\config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e) {
		}catch(IOException e) {
		}
		}
	
		public static void initialization() {
			String browserName = prop.getProperty("browser");
			if(browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver_win32\\chromedriver.exe");
				driver= new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtils.pagelLoadTime, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtils.implicitlywait, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
		
}


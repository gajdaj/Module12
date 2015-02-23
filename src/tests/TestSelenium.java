package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import tests.HomeDropBox;

public class TestSelenium {

	WebDriver driver = null;
	HomeDropBox homeTest = null;

	@BeforeTest
	public void before(){
		this.driver = new FirefoxDriver();
		this.driver.get("https://www.dropbox.com/");
	}
	
	@Test
	public void testHomePage() throws InterruptedException{
		this.homeTest = new HomeDropBox(this.driver);
		this.homeTest.getMainPage();
	}
	
	@AfterTest
	public void after(){
		this.driver.quit();
	}
}

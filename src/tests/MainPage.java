package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Base {
	@FindBy(xpath = "//*[@id=\"account-header\"]/ul/li[1]/a/div/div[2]/div")
	WebElement link;

	public MainPage(WebDriver driver) {
		super(driver);
	}

	public void getText() {
		System.out.println(link.getText());
	}

}

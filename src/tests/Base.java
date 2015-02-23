package tests;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
	
	private WebDriver driver = null;
	
	public Base(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}	
}

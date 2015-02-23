package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeDropBox extends Base{
	WebDriver driver = null;
	@FindBy(xpath="//*[@id=\"sign-in\"]/a")
	WebElement lnLogin;
	@FindBy(name="login_email")
	WebElement txtLogin;
	@FindBy(name="login_password")
	WebElement txtPass;
	@FindBy(xpath="//*[@id=\"sign-in-form\"]/form[1]/div[4]/button/div[1]")
	WebElement btLogin;
	
	
	public HomeDropBox(WebDriver driver){
		super(driver);
	}
	
	public void LnLoginClick(){
		this.lnLogin.click();
	}
	
	public void txtLoginSendKey() throws InterruptedException{
		Thread.sleep(4000);
		this.txtLogin.sendKeys("fdsfdsfsd");
	}
	
	public void txtPassSendKey(){
		this.txtLogin.sendKeys("dsfsdgdfgdf");
	}
	
	public void btLoginClick(){
		this.btLogin.click();
	}
	
	public  MainPage getMainPage() throws InterruptedException{
		LnLoginClick();
		Thread.sleep(4000);
		txtLoginSendKey();
		Thread.sleep(4000);
		txtPassSendKey();
		Thread.sleep(4000);
		return new MainPage(this.driver);
	}
	
}

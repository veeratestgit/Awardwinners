package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Award_winnersPage extends TestBase {
		
	@FindBy(xpath="//div[@id='listpromoproduct']/div[1]/div/a/img")
	WebElement book;
	
	@FindBy(xpath="//div[@id='ctl00_phBody_ProductDetail_divAddtoCart']/input")
	WebElement buy;
	
	@FindBy(xpath="//span[@class='itemcount']/label[@id='ctl00_lblTotalCartItems']")
	WebElement cart;
	
	@FindBy(xpath="//input[@value='Buy']")
	WebElement buy1;
	
	@FindBy(xpath="//input[@id='ctl00_phBody_SignIn_txtEmail']")
	WebElement email_box;
	
	@FindBy(xpath="//input[@id='ctl00_phBody_SignIn_txtPassword']")
	WebElement password_box;
	
	@FindBy(xpath="//a[@id='ctl00_phBody_SignIn_btnLogin']")
	WebElement button;
	public void selectbook() throws InterruptedException
	{
		Thread.sleep(3000);
		book.click();
		buy.click();
	}
	public void buybook() throws InterruptedException {
		Thread.sleep(1500);
		cart.click();
		buy1.click();
		
	}
	public void LoginDetails(String email,String password) throws InterruptedException {
		Thread.sleep(5000);
		email_box.sendKeys(email);
		password_box.sendKeys(password);
		button.click();
	
	}
	public Award_winnersPage() {
		PageFactory.initElements(driver, this);	
		
	}
}

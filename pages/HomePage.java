package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//li[@id='ctl00_liAW']/a")
	WebElement award;
	
	@FindBy(xpath="//select[@id='ddlSort']")
	WebElement sort;
	
	@FindBy(xpath="//select[@id='ddlSort']/option[4]")
	WebElement Discount;
		
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void	clickaward() throws InterruptedException {
		
		Thread.sleep(1500);
		award.click();
	}
	public void sortaward() throws InterruptedException {
		Thread.sleep(3000);
		sort.click();
		Discount.click();
	}
}

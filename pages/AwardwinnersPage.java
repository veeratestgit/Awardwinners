package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AwardWinnersPage extends TestBase {
	
	@FindBy(xpath="//select[@id='ddlSort']")
	WebElement sort;
	
	@FindBy(xpath="//select[@id='ddlSort']/option[4]")
	WebElement Discount;
	
	@FindBy(xpath="//div[@id='listpromoproduct']/descendant::a")
	WebElement Book;
	
	@FindBy(xpath="//div[@id='ctl00_phBody_ProductDetail_divaction']/descendant::input[1]")
	WebElement Cart;
	
	@FindBy(xpath="//span[@class='itemcount']/label[@id='ctl00_lblTotalCartItems']")
	WebElement cart1;
	
	@FindBy(xpath="//input[@value='Buy']")
	WebElement buy1;
	
	@FindBy(xpath="//input[@id='ctl00_cpBody_ShoppingCart_lvCart_savecontinue']")
	WebElement save;
	
	@FindBy(xpath=" //input[@id='ctl00_cpBody_lvCustomerAdd_ctrl0_btnUseAddress']")
	WebElement Address;
		
	
	public AwardWinnersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		
	}
	
	public void sortaward() {
		sort.click();
		Discount.click();
	}
	public void buybook() throws InterruptedException {
		Thread.sleep(1000);
		Book.click();
		Cart.click();	
	}
	public void cart() throws InterruptedException{
		Thread.sleep(1000);
		Cart1.click();
		buy1.click();
	}
	public void save() throws InterruptedException {
			Thread.sleep(1500);
			Address.click();
			Thread.sleep(1500);
			save.click();	
	}
	public boolean logo() { 
		    WebElement logo = driver.findElement(By.xpath("//img[@id="ctl00_imglogo"]"));
		    return logo.isDisplayed();
	}
	public boolean logoutvisible() { 
		    WebElement logoutvisible = driver.findElement(By.xpath("//a[@id='ctl00_lnkbtnLogout']"));
		    return logoutvisible.isDisplayed();
	}
}

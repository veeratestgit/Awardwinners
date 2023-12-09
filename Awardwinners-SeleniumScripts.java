package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tours1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maxamize the window
		driver.manage().deleteAllCookies(); // delete the cookies of the browser
		//open url
		driver.get("https://www.bookswagon.com/");
	
		Thread.sleep(3000);
		//click on award
		WebElement award = driver.findElement(By.xpath("//li[@id='ctl00_liAW']/a"));
		award.click();
		
		//clion sort and select discount option from the dropdown
		WebElement sort = driver.findElement(By.xpath("//select[@id='ddlSort']"));
		sort.click();
		WebElement sort1 = driver.findElement(By.xpath("//select[@id='ddlSort']/option[4]"));
		sort1.click();
		
		//select the first book
		WebElement book = driver.findElement(By.xpath("//div[@id='listpromoproduct']/div[1]/div/a/img"));
		book.click();
		//add to cart
		WebElement buy = driver.findElement(By.xpath("//div[@id='ctl00_phBody_ProductDetail_divAddtoCart']/input"));
		buy.click();
		
		Thread.sleep(1500);
		//click on carts to buy
		WebElement cart = driver.findElement(By.xpath("//span[@class='itemcount']/label[@id='ctl00_lblTotalCartItems']"));
		cart.click();
		//click on buy
		WebElement buy1 = driver.findElement(By.xpath("//input[@value='Buy']"));
		buy1.click();
		
		Thread.sleep(1500);
		//it will take to login page
		//enter details
		
		WebElement email = driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignIn_txtEmail']"));
		email.sendKeys("vijayvel10301@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignIn_txtPassword']"));
		password.sendKeys("group@123");
		
		WebElement login = driver.findElement(By.xpath("//a[@id='ctl00_phBody_SignIn_btnLogin']"));
		login.click();
		
		
		Thread.sleep(1500);	
	}
}

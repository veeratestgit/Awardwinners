package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pages.Award_winnersPage;
import pages.HomePage;
import pages.TestBase;
import utilities.Excelread;
import utilities.Listener;

@Listeners(value =Listener.class)
public class Award_winnersPageTest extends TestBase {
	Award_winnersPage Ap;
	HomePage hp;
	Excelread e = new Excelread();
	static int rowNum =0;
  
	@BeforeTest
	public void start_browser() {
		
		openBrowser();
		hp=new HomePage();
		Ap=new Award_winnersPage();
	}
		
	@Test(priority='1')
	public void testopenaward() throws InterruptedException {
		hp.clickaward();
	}
	@Test(priority='2')
	public void testsortbook() throws InterruptedException {
		
		hp.sortaward();
	}
	@Test(priority='3')
	public void testselectbook() throws InterruptedException {
		
		Ap.selectbook();
	}
	@Test(priority='4')
	public void testbuybook() throws InterruptedException {
		Ap.buybook();
	}
	@DataProvider
	public Object[][] loginData() throws IOException
	{
		int LastRow = e.getLastRow("C:\\Users\\INDIA\\Desktop\\mytestdata\\TestData3.xls","Sheet1");
		Object mydata[][] = new Object[LastRow+1][2];
		for(int i=0;i<=LastRow;i++)
		{
			mydata[i][0]=e.readExcel("C:\\Users\\INDIA\\Desktop\\mytestdata\\TestData3.xls","Sheet1",i,0);
			mydata[i][1]=e.readExcel("C:\\Users\\INDIA\\Desktop\\mytestdata\\TestData3.xls","Sheet1",i,1);
		}
		return mydata;
	}
	@Test(dataProvider="loginData",priority='5')
	public void testLogin(String email,String password) throws IOException, InterruptedException {
		Ap.LoginDetails(email,password);
		rowNum=rowNum+1;
	}
	@AfterTest
	public void close_browser() {
		driver.close();
	}
}

package home.pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import support.RepositoryParser;
import support.TestBase;

public class LoginPage{
	RepositoryParser parser;
	static TestBase ob;
	WebDriver driver;
	
//	public LoginPage(WebDriver driver) {
//		this.driver = driver;
//	}
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
//	
//	
	
	public void enterUserName(String userName2) throws IOException {
		System.out.println("userEmailOrPhone  dfdfdf  :"+ parser.getLocators("userName"));
		
		WebElement user = driver.findElement(parser.getLocators("userName"));	
		System.out.println("userEmailOrPhone  dfdfdf user :"+ user);
		
		user.clear();
		driver.findElement(parser.getLocators("userName")).clear();
		driver.findElement(parser.getLocators("userName")).sendKeys(userName2);
	}
	
	public void enterPassword(String password) throws IOException {
		driver.findElement(parser.getLocators("passWord")).clear();
		driver.findElement(parser.getLocators("passWord")).sendKeys(password);
	}
	
	public void clickButton() throws IOException {
		driver.findElement(parser.getLocators("loginButton")).click();
	}
	
	public String alertText() {
		return driver.switchTo().alert().getText();
	}

	
	

	
	public static void main(String args[]) throws IOException {
		
//		RepositoryParser obj = new RepositoryParser("src/test/java/support/resources/LoginPage.properties");
//		ob.initiateBasicSetup("dfdf");
//		LoginPage obj1 = new LoginPage(driver);
//		enterUserName("manoj");
//		LoginPage obj2 = new LoginPage(driver);
//		
//		System.out.println("sds:"+obj.getLocators("userName"));
		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
//		System.setProperty("webdriver.chrome.driver", "src/test/java/support/drivers/chromedriver.exe");
//		
//		TestBase ob = new TestBase();
		
		}
	
	
}

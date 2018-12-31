package home.pageObjects;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import support.RepositoryParser;
import support.TestBase;

public class LoginPage2 extends TestBase{

	public WebDriver driver;
	RepositoryParser parser;
	
	public LoginPage2(WebDriver driver) throws IOException{
		super(driver);
		this.driver = driver;
		parser = new RepositoryParser("src/test/java/support/resources/LoginPage.properties");
	}    
	
	public void getUrl() {
		driver.get("C:/Users/DjanGo/workspaceManoj/loginForm/src/loginFormHtml/LoginPage.html");
	}
	
	public  void enterUserName(String userName2) throws IOException {
		WebElement user = driver.findElement(parser.getLocators("userName"));	
		user.clear();
		user.sendKeys(userName2);
	}
	
	public void enterPassword(String password) throws IOException {
		WebElement pass = driver.findElement(parser.getLocators("passWord"));
		pass.clear();
		pass.sendKeys(password);
	}
	
	public void clickButton() throws IOException {
		WebElement loginButton = driver.findElement(parser.getLocators("loginButton"));
		loginButton.click();
	}
	
	public  String alertText() {
		return driver.switchTo().alert().getText();
	}

	
}

package home.pageObjects;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import support.RepositoryParser;
import support.TestBase;

public class LoginPage2{


		public static void setUp() throws IOException {
//			initiateBasicSetup();
		}
		
		public static void getUrl() {
			TestBase.driver.get("C:/Users/DjanGo/workspaceManoj/loginForm/src/loginFormHtml/LoginPage.html");
		}
		
		public static void enterUserName(String userName2) throws IOException {
			WebElement user = TestBase.driver.findElement(By.id("user"));	
			user.clear();
			user.sendKeys(userName2);
		}
		
		public static void enterPassword(String password) throws IOException {
			TestBase.driver.findElement(By.id("pass")).clear();
			TestBase.driver.findElement(By.id("pass")).sendKeys(password);
		}
		
		public static void clickButton() throws IOException {
			TestBase.driver.findElement(By.id("loginBtn")).click();
		}
		
		public static String alertText() {
			return TestBase.driver.switchTo().alert().getText();
		}

	
}

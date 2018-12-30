package home.stepDefs;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import runner.Hooks;
import support.RepositoryParser;
import support.TestBase;
import cucumber.api.java.en.Then;


public class LoginTest_step {
	public static RepositoryParser parser;


	@Given("^user is  on homepage$")
	public void user_is_on_homepage() throws Throwable {
		parser = new RepositoryParser("src/test/java/support/resources/LoginPage.properties");
		TestBase.driver.get("C:/Users/DjanGo/workspaceManoj/loginForm/src/loginFormHtml/LoginPage.html");
	}

	@When("^user enters username and Password$")
	public void user_enters_username_and_Password() throws Throwable {
		
		System.out.println(parser.getLocators("userName"));
		WebElement user = TestBase.driver.findElement(parser.getLocators("userName"));	
		user.clear();
		user.sendKeys("manoj");
		TestBase.driver.findElement(By.id("pass")).clear();
		TestBase.driver.findElement(By.id("pass")).sendKeys("manoj");
	}
	
	@When("^user clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		TestBase.driver.findElement(By.id("loginBtn")).click();
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
		Assert.assertEquals("Welcome", TestBase.driver.switchTo().alert().getText());
	}

}

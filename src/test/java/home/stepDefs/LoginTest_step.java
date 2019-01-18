package home.stepDefs;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import home.pageObjects.LoginPage2;
import junit.framework.Assert;
import cucumber.api.java.en.Then;


public class LoginTest_step {
	
	LoginPage2 lpObj;
	private WebDriver driver;

	public LoginTest_step() throws IOException {
		driver = Hooks.driver;
		lpObj = new LoginPage2(driver);
	}

	@Given("^user is  on homepage$")
	public void user_is_on_homepage() throws Throwable {
		lpObj.getUrl();
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_and_Password(String userName, String passWord) throws Throwable {
		lpObj.enterUserName(userName);
		lpObj.enterPassword(passWord);
	}
	
	@When("^user clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		lpObj.clickButton();
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
		String alertMsg = lpObj.alertText();
		Assert.assertEquals("Welcome", alertMsg, "Alert message does not matched");
	}
	
	@Then("^user is  on google homepage$")
	public void google_home() throws Throwable {
		driver.get("https://www.google.co.in/");
	}
	
//	@Then("^user enters \"([^\"]*)\" in search$")
//	public void enter_search(String searchText) throws Throwable {
//		
//	}

	@Given("^user enters \"([^\"]*)\" in search$")
	public void user_enters_in_search(String searchText) throws Throwable {
		System.out.println("Search value: " + searchText);
		driver.findElement(By.xpath("//input[@title = 'Search']")).clear();
		driver.findElement(By.xpath("//input[@title = 'Search']")).sendKeys(searchText);
	}

	
}

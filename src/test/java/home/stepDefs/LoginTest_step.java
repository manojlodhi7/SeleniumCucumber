package home.stepDefs;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import home.pageObjects.LoginPage2;
import junit.framework.Assert;
import cucumber.api.java.en.Then;


public class LoginTest_step {
	
	public WebDriver driver;

	public LoginTest_step() {
		driver = Hooks.driver;
	}

	@Given("^user is  on homepage$")
	public void user_is_on_homepage() throws Throwable {
		new LoginPage2(driver).getUrl();
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_and_Password(String userName, String passWord) throws Throwable {
		new LoginPage2(driver).enterUserName(userName);
		new LoginPage2(driver).enterPassword(passWord);
	}
	
	@When("^user clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		new LoginPage2(driver).clickButton();
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
		String alertMsg = new LoginPage2(driver).alertText();
		Assert.assertEquals("Welcome", alertMsg, "Alert message does not matched");
	}

}

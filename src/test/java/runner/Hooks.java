package runner;

import java.io.IOException;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import support.RepositoryParser;
import support.TestBase;

public class Hooks {
	
//	TestBase obj = TestBase.getInstance();

	String url = "C:/Users/DjanGo/workspaceManoj/loginForm/src/loginFormHtml/LoginPage.html";
//	public WebDriver driver;
	
	@Before
	public void beforeTest() throws Throwable {
//		TestBase.parser = new RepositoryParser("src/test/java/support/resources/LoginPage.properties");
		TestBase.getInstance();
		
	}
	
	@After
	public void afterTest() {
		TestBase.driver.quit();
	}
}

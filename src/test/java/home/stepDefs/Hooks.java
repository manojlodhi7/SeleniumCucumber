package home.stepDefs;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks{
	
	public static WebDriver driver;
	String url = "C:/Users/DjanGo/workspaceManoj/loginForm/src/loginFormHtml/LoginPage.html";
	FileInputStream fis;
	Properties pObj;
	
	@Before
	public void beforeTest() throws Throwable {
		fis = new FileInputStream("src/test/java/support/config.properties");
		pObj = new Properties();
		pObj.load(fis);
					
		if(pObj.getProperty("browser").equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "src\\test\\java\\support\\drivers\\chromedriver.exe");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(pObj.getProperty("loginURL"));
		} 
		else if (pObj.getProperty("browser") == "firefox") {
			
		}
		
	}
	
	@After
	public void afterTest() {
//		driver.quit();
	}
}

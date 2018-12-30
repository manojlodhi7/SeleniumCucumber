package support;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	public static  WebDriver driver;
	public  WebDriverWait wait;
//	public static RepositoryParser parser;
	public static FileInputStream fis;
	public static Properties config;
	static String configUrl = "src/test/java/support/config.properties";
	
	static TestBase testBaseObj = new TestBase();
	private TestBase() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "src/test/java/support/drivers/chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		// TODO Auto-generated constructor stub
	}
	
	public static TestBase getInstance() throws IOException {
	
		return testBaseObj;
	}
	
	
//	public static WebDriver launchBrowser(String browser) throws IOException {
//		if(browser == "chrome") {
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--disable-notifications");
//			System.setProperty("webdriver.chrome.driver", "src/test/java/support/drivers/chromedriver.exe");
//			driver = new ChromeDriver(options);
//			driver.manage().window().maximize();
//			return driver;
//		} else if (browser == "firefox") {
//			
//		}
//		return null;
//	}
//	
//	public static void loadPropertries() throws IOException {
//		fis = new FileInputStream(configUrl);
//		config = new Properties();
//		config.load(fis);
//	}
//	
//	public static void initiateBasicSetup() throws IOException {
//		loadPropertries();
//		launchBrowser(config.getProperty("browser"));
////		driver.get(config.getProperty("loginURL"));
////		driver.get(getUrl);
//	}
//	
//	public void closeBrowser(){
////		driver.quit();
//	}
}

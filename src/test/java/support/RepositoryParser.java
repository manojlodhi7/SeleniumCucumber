package support;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class RepositoryParser{
	
	private static Properties loginPage = new Properties();;
	private FileInputStream fis;
	private String RepositoryFile;
	
	
	public RepositoryParser(String fileName) throws IOException
	{
		this.RepositoryFile = fileName;
		fis = new FileInputStream(RepositoryFile);
		loginPage.load(fis);
	}
	
	
	
	public By getLocators(String locatorName) {
		
		String locatorProperty = loginPage.getProperty(locatorName);
		System.out.println(locatorProperty.toString());
		String locatorType = locatorProperty.split(":")[0];
		String locatorValue = locatorProperty.split(":")[1];
		System.out.println("locatorValue  :" +locatorValue);
		
		By locator = null;
		switch(locatorType)
		{
		case "Id":
			locator = By.id(locatorValue);
			break;
		case "Name":
			locator = By.name(locatorValue);
			break;
		case "CssSelector":
			locator = By.cssSelector(locatorValue);
			break;
		case "LinkText":
			locator = By.linkText(locatorValue);
			break;
		case "PartialLinkText":
			locator = By.partialLinkText(locatorValue);
			break;
		case "TagName":
			locator = By.tagName(locatorValue);
			break;
		case "Xpath":
			locator = By.xpath(locatorValue);
			break;
		}
		return locator;
	}
	
//	public static void main(String args[]) throws IOException {
//		RepositoryParser obj = new RepositoryParser("src/test/java/support/resources/LoginPage.properties");
//		
//		System.out.println("sds:"+obj.getLocators("userName"));
//		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
//		System.setProperty("webdriver.chrome.driver", "src/test/java/support/drivers/chromedriver.exe");
//		driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.get("C:/Users/DjanGo/workspaceManoj/loginForm/src/loginFormHtml/LoginPage.html");
//		driver.findElement(RepositoryParser.getLocators("userName")).sendKeys("manoj");
//	}
	
}

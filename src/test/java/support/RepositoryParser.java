package support;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import com.cucumber.listener.Reporter;


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
		Reporter.addStepLog("Getting locator value");
		String locatorType = locatorProperty.split(":")[0];
		String locatorValue = locatorProperty.split(":")[1];
		
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
	
}

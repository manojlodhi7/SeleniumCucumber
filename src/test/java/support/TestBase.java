package support;

import org.openqa.selenium.WebDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static boolean bResult;

	public  TestBase(WebDriver driver){
		TestBase.driver = driver;
		TestBase.bResult = true;
	}
	
}

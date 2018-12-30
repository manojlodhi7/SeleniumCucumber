package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features= {"src/test/java/home/feature"},
		glue = {"home/stepDefs"},
		plugin = {"pretty", "html: target/cucumber-reports/reports",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		monochrome = true,
		tags = {"@IntegrationTest"}
		)



public class CucumberRunner {
	
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("src/test/java/runner/report.xml"));
    
    }

}

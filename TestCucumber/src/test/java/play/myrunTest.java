package play;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/play/feature/"},
		glue = {"play/stepdef/"},
		plugin= {"pretty","html:target/Cucumber-HtmlReport",
				"json:target/Cucumber-report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"},
		monochrome=true,
		dryRun=false,
		tags = {"@Sanity,@Regression,@SearchTest"}
		
		)
public class myrunTest {
	

}

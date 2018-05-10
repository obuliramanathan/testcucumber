package play.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class baseTest {

	WebDriver driver = null;
	
	
	@Before(order=1)
	public WebDriver initializeWebDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	@Before(order=2)
	public void beforeMethod2 () {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@After(order=1)
	public void afterMethod1 () throws InterruptedException {
		Thread.sleep(2000);
	}
	
	@After(order=2)
	public void afterMethod2 () {
		driver.quit();
		driver=null;
	}
}

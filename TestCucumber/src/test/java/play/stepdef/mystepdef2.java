package play.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class mystepdef2 {
	
	WebDriver driver;
	
	public mystepdef2 (baseTest base) {
		driver = base.initializeWebDriver();
	}
/*	
	@Before(order=1)
	public void beforeMethod1 () {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
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
	}
*/
	
	@Given("^User need to be on the Google page$")
	public void User_need_to_be_on_the_Google_page () {
		
		driver.get("http://www.google.com/");
	}
	
	@Then ("^User enter \"([^\"]*)\" to search$")
	public void User_enter_keyword_to_search (String s) {
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(s);
	}
	
	@When ("^Click on search button$")
	public void Click_on_search_button () {
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
	}
	
}

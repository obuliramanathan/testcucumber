package play.stepdef;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class mystepdef1 {
	
	WebDriver driver;

	
	public mystepdef1 (baseTest base) {
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
	
	@After
	public void afterMethod () {
		driver.quit();
	}
*/
	
	@Given("^User need to be on the AMP application login page$")
	public void User_need_to_be_on_the_AMP_application_login_page () {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://analyticstools-uat.iriworldwide.com/controlpanel/");
		
	}
	
	@When ("^User enter the username$")
	public void User_enter_the_username () {
		driver.findElement(By.xpath("//*[@id='loginPage']/div/div/div/div[2]/form/div[1]/div/input")).sendKeys("prajt");
		
	}
	
	@And ("^User enter the password$")
	public void User_enter_the_password () {
		//*[@id='loginPage']/div/div/div/div[2]/form/div[2]/div/input
		driver.findElement(By.xpath("//*[@id='loginPage']/div/div/div/div[2]/form/div[2]/div/input")).sendKeys("Anjeev@123");
	}
	
	@Then ("^Click on login button$")
	public void Click_on_login_button () throws InterruptedException {
		////*[@id="loginsubmit"]
		driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();
		Thread.sleep(2000);
		
	}
	
	@And ("^Close the browser$")
	public void Close_the_browser () {
		driver.quit();
	}
	
	@When ("^User enter login credentials$")
	public void User_enter_login_credentials (DataTable dt) {
		List <List <String>> data = dt.raw();
		
		//System.out.println("Username: "+data.get(1).get(0));
		//System.out.println("Password: "+data.get(1).get(1));
		
		driver.findElement(By.xpath("//*[@id='loginPage']/div/div/div/div[2]/form/div[1]/div/input")).sendKeys(data.get(1).get(0));
		driver.findElement(By.xpath("//*[@id='loginPage']/div/div/div/div[2]/form/div[2]/div/input")).sendKeys(data.get(1).get(1));
	}

	@When("^User enter \"([^\"]*)\" as the username$")
	public void user_enter_paramdata_as_the_username (String s) {
		driver.findElement(By.xpath("//*[@id='loginPage']/div/div/div/div[2]/form/div[1]/div/input")).sendKeys(s);
	}
	
	@When("^User enter \"([^\"]*)\" as the password$")
	public void user_enter_paramdata_as_the_password (String s) {
		driver.findElement(By.xpath("//*[@id='loginPage']/div/div/div/div[2]/form/div[2]/div/input")).sendKeys(s);
	}
	
}

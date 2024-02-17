package stepdifinition_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class C_Stepdefinition {
	
	WebDriver driver;
	
	@Given("^open application url$")
	public void open_application_url() throws Throwable {
		System.setProperty("wedriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions ();
		ops.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver();
		//get method is responsible to open our browser
		driver.get("https://demoblaze.com/");// open application Url
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize(); //manage method is responsible for 
		//maximize the site frame size.  
	}

	@Then("^click on loginlink$")
	public void click_on_loginlink() throws Throwable {
		WebElement loginlink= driver.findElement(By.id("login2"));
		loginlink.click();
	    
	}

	@Then("^verify login page display$")
	public void verify_login_page_display() throws Throwable {
		
		Thread.sleep(2000);
		boolean tom = driver.findElement(By.id("logInModalLabel")).isDisplayed();
		Assert.assertTrue(tom);
		Thread.sleep(2000);
		
		driver.close();
		
		
	    
	}



}

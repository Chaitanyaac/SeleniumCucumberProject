package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test1 {

	WebDriver driver;

	@Given("I go to google search page")
	public void i_go_to_google_search_page() {
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		driver =new FirefoxDriver();
		driver.get("http://www.google.com");
	}
	
	@When("i enter selenium and hit enter")
	public void i_enter_selenium_and_hit_enter() {
		driver.findElement(By.name("q")).sendKeys("selenium");	
	}
	
	@Then("I saw websites belonging to Selenium")
	public void i_saw_websites_belonging_to_selenium() {

		driver.quit();
	}


}

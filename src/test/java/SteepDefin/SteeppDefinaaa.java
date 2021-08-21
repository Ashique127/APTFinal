package SteepDefin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SteeppDefinaaa {

	WebDriver driver;

	@Given("^browser is open$")
	public void browser_is_open() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ashique\\eclipse\\java-2021-03\\eclipse\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Then("^user is on google search page$")
	public void user_is_on_google_search_page() throws Throwable {
		driver.get("https://www.google.com//");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@Then("^user enters a text in google search box$")
	public void user_enters_a_text_in_google_search_box() throws Throwable {
		driver.findElement(By.name("q")).sendKeys("automation step by step");

	}

	@Then("^hits Enter$")
	public void hits_Enter() throws Throwable {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("^user is navigated to the Search Reuslts Page$")
	public void user_is_navigated_to_the_Search_Reuslts_Page() throws Throwable {
		driver.findElement(By.xpath("//h3[text()='Automation Step by Step - YouTube']")).click();
	}

}

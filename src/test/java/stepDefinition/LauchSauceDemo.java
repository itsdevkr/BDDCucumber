package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LauchSauceDemo {

	public WebDriver driver;
	public SoftAssert softAssert;
	
	@Given("Url for Sauce Demo Application")
	public void url_for_sauce_demo_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("Url is validated")
	public void url_is_validated() {
	    driver.get("https://www.saucedemo.com/");
	    
	}

	@When("Enter Username")
	public void enter_username() {
	    WebElement txtUsername = driver.findElement(By.xpath("//input[@id='user-name']"));
	    txtUsername.sendKeys("standard_user");
	}

	@When("Enter Password")
	public void enter_password() {
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));
		txtPassword.sendKeys("secret_sauce");
	}

	@Then("Click Login")
	public void click_login() {
	    WebElement btnLogin;
	    btnLogin = driver.findElement(By.xpath("//input[@id='login-button']"));
	    btnLogin.click();
	}

	@Then("Close the Application")
	public void close_the_application() {
	    driver.quit();
	}
	
}

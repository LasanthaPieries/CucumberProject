package stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSetpDef {
	
	WebDriver driver = Hooks.driver;

	@Given("I have launched the application")
	public void i_have_launched_the_application() {
		
		// Open given web page
		driver.get("https://www.simplilearn.com");
		
		// Maximize window
		driver.manage().window().maximize();

		// Putting a wait implicitly
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);

	}

	@When("I enter the correct username and password")
	public void i_enter_the_correct_username_and_password() {
		WebElement UserName = driver.findElement(By.name("user_login"));
		WebElement Password = driver.findElement(By.id("password"));
		UserName.sendKeys("Lasantha.pieries@gmail.com");
		Password.sendKeys("Test@45678");

	}

	@Then("I should land on the home page")
	public void i_should_land_on_the_home_page() {
	}

	@When("I enter the incorrect username and password")
	public void i_enter_the_incorrect_username_and_password() {
		WebElement UserName = driver.findElement(By.name("user_login"));
		WebElement Password = driver.findElement(By.id("password"));
		UserName.sendKeys("Lasantha.pieries@gmail.com");
		Password.sendKeys("Test@1234");

	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String ExpError) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Error = driver.findElement(By.id("msg_box"));
		String ActError = Error.getText();
		Assert.assertEquals(ExpError, ActError);	
	}
	
	@And("I click on the Login Link")
	public void i_click_on_the_Login_Link() {
		// Locate web element and click on it
		WebElement loginBtn = driver.findElement(By.linkText("Log in"));
		loginBtn.click();

	}

	@And("I click on the Login Button")
	public void i_click_on_the_Login_Button() {
		// Locate web element and click on it
		WebElement LoginBt2 = driver.findElement(By.name("btn_login"));
		LoginBt2.click();
	}
	
	@When("I enter the username as {string} and password as {string}")
	public void i_enter_the_username_as_and_password_as(String UserNameVal, String PwdVal) {
	   
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(UserNameVal);

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(PwdVal);
	}


}

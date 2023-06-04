package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class LoginToAmazonAccount {
	
	WebDriver driver; 

@Given("I am on the amazon homepage")
public void i_am_on_the_amazon_homepage() {
    // hey how are u 
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
}

@When("I click on the sign in button")
public void i_click_on_the_sign_in_button() {
    
}

@When("I enter the {string} in user name input field")
public void i_enter_the_in_user_name_input_field(String string) {
    
}

@When("I enter the {string} in password input field")
public void i_enter_the_in_password_input_field(String string) {
    
}

@Then("I can successfully login to my amazon account")
public void i_can_successfully_login_to_my_amazon_account() {
    
}



}

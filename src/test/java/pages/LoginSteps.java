package pages;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;

public class LoginSteps {

    WebDriver driver;

    @Given("the user is on the login page1")
    public void user_is_on_login_page() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Java\\chromedriver-win64\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://www.saucedemo.com/v1/index.html");
        System.out.println("Enter User Login url");
    }

    @When("the user enters valid username and password")
    public void user_enters_credentials() {
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.id("login-button")).click();
        System.out.println("Enter valid username and password");
    }



    @Then("the user should be redirected to the dashboard")
    public void user_should_see_dashboard() {
//        String expectedUrl = "https://www.saucedemo.com/v1/inventory.html";
//        assert driver.getCurrentUrl().equals(expectedUrl);
//        driver.quit();
        System.out.println("See Dashboard");
        driver.close();
    }
}

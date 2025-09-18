package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import libraries.CommonFunctionalities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomeStore18AboutUs;
import pages.HomeStore18Login;
import pages.HomeStore18WirelessAndHeadphonePage;

public class BaseAssigner {
    WebDriver driver = Hooks.driver;
    HomeStore18Login homeStore18Login;
    HomeStore18AboutUs homeStore18AboutUs;
    HomeStore18WirelessAndHeadphonePage homeStore18WirelessAndHeadphonePage;

    public BaseAssigner(){
        homeStore18Login = new HomeStore18Login(driver);
        homeStore18AboutUs= new HomeStore18AboutUs(driver);
        homeStore18WirelessAndHeadphonePage = new HomeStore18WirelessAndHeadphonePage(driver);
    }

    @Given("launch the {string} browser")
    //@Step("launch the {string} browser")
    public void launchBrowser(String  browser) {
        switch (browser){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Unable to launch the browser as user has not given a proper type to proceed");
        }

    }

    @Given("user with url {string} should navigate to the respective page")
    //@Step("user with url {string} should navigate to the respective page")
    public void user_Is_On_The_Login_Page(String  url) {
        driver.get(url);
    }


    @And("validate the given element {string} present with given xpath {string}")
    //@Step("validate the given element {string} present with given xpath {string}")
    public void validateTheGivenPage(String  compareWith, String xpath) {
        /*if(page.equals("loginPage"))
        homeStore18Login.validateLoginPage();
        else if(page.equals("aboutusPage"))
            homeStore18AboutUs.validateAboutUsPage();*/
        CommonFunctionalities.validateAboutUsPage(driver, By.xpath(xpath), compareWith);
    }

    @When("user enters valid {string} and {string}")
    //@Step("user enters valid {string} and {string}")
    public void userEntersValidAnd(String userName, String password1) {
        homeStore18Login.userEntersValidAnd(userName, password1);
    }

    @When("click login button")
    //@Step("click login button")
    public void click_button() {
        homeStore18Login.click_button();
    }

    @Then("user should be redirected to the dashboard")
    //@Step("user should be redirected to the dashboard")
    public void user_should_see_dashboard() {
        homeStore18Login.user_should_see_dashboard();
    }

    @Given("click on Headphones tab")
    //@Step("click on Headphones tab")
    public void clickOnHeadphonesTab() {
        homeStore18WirelessAndHeadphonePage.clickOnHeadphonesTab();
    }

    @When("I click on Wireless and bluetooth headphone sub-menu")
    //@Step("I click on Wireless and bluetooth headphone sub-menu")
    public void iClickOnWirelessAndBluetoothHeadphoneSubMenu() {
        homeStore18WirelessAndHeadphonePage.iClickOnWirelessAndBluetoothHeadphoneSubMenu();
    }

    @Then("user should be redirected to the Wireless and bluetooth headphones section")
    //@Step("user should be redirected to the Wireless and bluetooth headphones section")
    public void userShouldBeRedirectedToTheWirelessAndBluetoothHeadphonesSection() {
        homeStore18WirelessAndHeadphonePage.userShouldBeRedirectedToTheWirelessAndBluetoothHeadphonesSection();
    }
}

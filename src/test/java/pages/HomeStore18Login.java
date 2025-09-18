package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import libraries.LoggerHelper;

public class HomeStore18Login {
    private WebDriver driver;

    public HomeStore18Login(WebDriver driver) {
        this.driver = driver;
    }

    // String webUrl="https://homestores18india.in/account/login";
    By emailId=By.id("customerEmail");
    By password=By.id("customerPassword");
    By button=By.xpath("//button[@class=\"btn btn-large btn-primary\" and contains(text(), 'Login')]");
    By myProfile=By.xpath("//h1[@class=\"m-zero h2\" and contains(text(),'My account')]");


    /*@Given("user is on the login page1")
    public void login_page() {
        driver.get(webUrl);
        String loginTitle=driver.findElement(By.xpath("//h1[@class='m-zero h2' and contains(text(),'Login')]")).getText();
        Assert.assertEquals("Login",loginTitle);  //hard assertion most of the time we use this only, if true then execute next steps

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }*/

//    @When("user enters valid username and password")
//    public void enters_credentials() {
//        try {
//            System.out.println("waiting");
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(emailId).sendKeys("jobova1861@blaxion.com");
//        driver.findElement(password).sendKeys("Qwerty");
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public void click_button() {
        driver.findElement(button).click();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void user_should_see_dashboard() {
       try {
            String title=driver.findElement(myProfile).getText();
            Assert.assertEquals("My account",title);
            //driver.close();
        } catch (Exception e) {

        }
    }

    public void validateLoginPage() {
        String loginTitle=driver.findElement(By.xpath("//h1[@class='m-zero h2' and contains(text(),'Login')]")).getText();
        Assert.assertEquals("Login",loginTitle);  //hard assertion: most of the time we use this only, if true then execute next steps

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


//    @Given("user with url {string} and {string} should navigate to the respective page")
//    public void user_Is_On_The_Login_Page(String  url1, String url2) {
//        driver.get(url1);
//        //String loginTitle=driver.findElement(By.xpath("//h1[@class='m-zero h2' and contains(text(),'Login')]")).getText();
//        //Assert.assertEquals("Login",loginTitle);  //hard assertion most of the time we use this only, if true then execute next steps
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        driver.get(url2);
//        //String loginTitle=driver.findElement(By.xpath("//h1[@class='m-zero h2' and contains(text(),'Login')]")).getText();
//        //Assert.assertEquals("Login",loginTitle);  //hard assertion most of the time we use this only, if true then execute next steps
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.close();
//    }

    public void userEntersValidAnd(String userName, String password1) {
        LoggerHelper.info("About to enter the details");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(emailId).sendKeys(userName);
        LoggerHelper.info("Username["+userName+"] entered successfully");

        driver.findElement(password).sendKeys(password1);
        LoggerHelper.info("password["+password1+"] entered successfully");

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

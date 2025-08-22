package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeStore18AboutUs {
    private WebDriver driver;
   // String webUrl="https://homestores18india.in/account/login";
    By aboutUsBreadCrumb =By.xpath("//span[text()='About us']");
    By aboutUsTitle =By.xpath("//h1[text()='About us']");

    public HomeStore18AboutUs(WebDriver driver){
        this.driver = driver;
    }


    public void validateAboutUsPage() {
        String loginTitle=driver.findElement(By.xpath("(//*[text()='About us'])[3]")).getText();
        Assert.assertEquals("About Us",loginTitle);  //hard assertion most of the time we use this only, if true then execute next steps
    }


    public void userReachesToTheAboutUsPage() {
        System.out.println("I am in reaches to the page");
    }


    public void validateIfAboutUsIsDisplayedaAsTheTitle() {
        System.out.println("I am in valiation page");
    }
}

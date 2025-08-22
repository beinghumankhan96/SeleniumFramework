package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLabs {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/index.html");

//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.name("password")).sendKeys("secret_sauce");
//        driver.findElement(By.className("btn_action")).click();

        //using CSS Selector

        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
                                        //CSS - tagName#(id/name/class)AnyAttributeValue
        driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
                                    //CSS - tagName[Attribute name=value]

        driver.findElement(By.cssSelector("input.btn_action")).click(); //css :tagName.value of class name

        //to get the handle of login page later window

        String currWindow=driver.getWindowHandle();
        driver.switchTo().window(currWindow);

        //driver.findElement(By.partialLinkText("Bolt T-Shirt")).click();

        //using CSS selector-> *:contains, ^: Starts with ; $: ends with

        //driver.findElement(By.cssSelector("button.btn_primary btn_inventory")).click(); //css: tag.ValueOfClass[attribute=value]

        driver.findElement(By.cssSelector("button[class$=inventory]")).click(); //tag[attribute$=substring] :all the locator have same ,it picks 1st one
    }
}

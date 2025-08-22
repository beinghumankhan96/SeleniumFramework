package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tofg1 {
    public  static void main (String[] args) throws InterruptedException {
        WebDriver x = new ChromeDriver();
        x.get("http://13.202.43.103:30004/account/login");
        x.manage().window().maximize();

        WebElement element1 = x.findElement(By.id("employeeId"));
        Thread.sleep(3000);
        element1.sendKeys("Administrator");

        WebElement element2 = x.findElement(By.id("review"));
        Thread.sleep(3000);
        element2.sendKeys("Administrator");

        WebElement element3 = x.findElement(By.className("login_btn"));
        Thread.sleep(3000);
        element3.click();
    }
}

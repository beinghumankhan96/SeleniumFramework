package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver obj=new ChromeDriver(); //gmail sing in
        obj.get("https://accounts.google.com/v3/signin/identifier?continue=https://mail.google.com/mail/u/0/?tab%3Drm%26ogbl&dsh=S1898301880:1750661820133760&emr=1&flowEntry=ServiceLogin&flowName=GlifWebSignIn&followup=https://mail.google.com/mail/u/0/?tab%3Drm%26ogbl&ifkv=AdBytiMlbdzIcdu5nj39DeAJeAfImUBHUxVukcNvzQ11iZE9ATZko8QVzfUzOqGmFo8NU0MStS3C&osid=1&service=mail");
        obj.manage().window().maximize();

        WebElement userName =obj.findElement(By.xpath("//*[@type='email']"));
        Thread.sleep(3000);
        userName.sendKeys("hamadt96@gmail.com");
        //userName.click();

        WebElement keyclick = obj.findElement(By.xpath("(//*[@jsname='V67aGc'])[2]"));
        Thread.sleep(3000);
        keyclick.click();

        Thread.sleep(3000);
        WebElement password = obj.findElement(By.xpath("(//*[@class='whsOnd zHQkBf'])[1]"));
        password.sendKeys("@Su32936@");

        Thread.sleep(3000);
        WebElement login = obj.findElement(By.xpath("(//*[@class='VfPpkd-RLmnJb'])[2]"));
        login.click();

        //obj.quit();

    }
}

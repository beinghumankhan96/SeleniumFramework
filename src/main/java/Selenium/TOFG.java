package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOFG {
    public  static void main(String[] args) throws InterruptedException {

        WebDriver obj =new ChromeDriver();
        obj.get("https://1weaou.life/v3/5123/91club?p=25g4"); //91 club
        obj.manage().window().maximize();

        /*WebElement CountryCode = obj.findElement(By.xpath("//*[@class='select__button']"));
        Thread.sleep(3000);
        CountryCode.sendKeys("+91");*/

        WebElement phone = obj.findElement(By.xpath("//*[@class='input-tel__input']"));
        Thread.sleep(3000);
        phone.sendKeys("8495990452");

        WebElement email = obj.findElement(By.id("input-email"));
        Thread.sleep(3000);
        email.sendKeys("abc@gmail.com");

        WebElement password = obj.findElement(By.id("password"));
        Thread.sleep(3000);
        password.sendKeys("admin123");

        WebElement submit1 = obj.findElement(By.className("form__action"));
        Thread.sleep(3000);
        submit1.click();


    }
}

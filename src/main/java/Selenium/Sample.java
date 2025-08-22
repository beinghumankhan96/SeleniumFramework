package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Sample {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.drive","C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Google Chrome");
        WebDriver driver= new ChromeDriver();  //Launch chrome , WebDriver is Interface implementing ChromeDriver class(child)
        driver.get("http://www.google.com");    //enter url
        String title=driver.getTitle();            //if you want the title of the url
        System.out.println(title);                  //title is type of string


        //validation point : test case incomplete without validation that is expected vs actual
        if (title.equals("Google"))                 //String comparing
        {
            System.out.println("Correct title");

        } else {System.out.println("In-correct title");}

        System.out.println(driver.getCurrentUrl()); // to get the url which object you are running

        System.out.println(driver.getPageSource());  //sourceCode

        driver.quit();
    }
}

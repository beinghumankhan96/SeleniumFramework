package libraries;

import io.cucumber.datatable.internal.difflib.StringUtills;
import io.opentelemetry.api.internal.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickWrapper {

    WebDriver driver;

    public ClickWrapper(WebDriver driver) {
        this.driver = driver;
    }

    public void clickWithMessage(By by, String message, String screenshotName) {
        System.out.println("About to click: "+message);
        try {
        driver.findElement(by).click();
        } catch (Exception e){
            System.out.println("Unable to click: "+message);
            if(!StringUtils.isNullOrEmpty(screenshotName))
            CommonFunctionalities.captureTheScreenshot(driver, screenshotName);
        }
        System.out.println("Clicked on: "+message);
    }

    public void clickWithMessageAndFailTestCase(By by, String message, String screenshotName) {
        System.out.println("About to click: "+message);
        try {
            driver.findElement(by).click();
        } catch (Exception e){
            System.out.println("Unable to click: "+message);
            if(!StringUtils.isNullOrEmpty(screenshotName))
                CommonFunctionalities.captureTheScreenshot(driver, screenshotName);
            Assert.fail();
        }
        System.out.println("Clicked on: "+message);
    }

}

package libraries;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class CommonFunctionalities {

    public static void validateAboutUsPage(WebDriver driver, By by, String compareWith) {
        String loginTitle=driver.findElement(by).getText();
        Assert.assertEquals(compareWith,loginTitle);  //hard assertion most of the time we use this only, if true then execute next steps
    }

    public static void captureTheScreenshot(WebDriver driver, String fileName){
        LoggerHelper.info("About to capture the screenshot");
        TakesScreenshot takesScreenshot = ((TakesScreenshot) driver);
        File file = takesScreenshot.getScreenshotAs(OutputType.FILE);

        File destination = new File(fileName);

        try {
            // Copy file to desired location
            FileUtils.copyFile(file, destination);
            LoggerHelper.info("Screenshot saved successfully.");
        } catch (IOException e) {
            LoggerHelper.info("Failed to save screenshot: " + e.getMessage());
        }
        LoggerHelper.info("screenshot is being captured");
    }
}

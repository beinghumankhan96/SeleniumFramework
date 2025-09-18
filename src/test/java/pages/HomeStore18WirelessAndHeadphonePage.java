package pages;

import libraries.ClickWrapper;
import libraries.SendKeysWrapper;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import libraries.LoggerHelper;


public class HomeStore18WirelessAndHeadphonePage {

    private WebDriver driver;
    By headphoneMenu =By.xpath("//*[@class='list-menu d-b22lock link__title']");
    By wireLessAndBluetoothHeadphoneSubMenu =By.xpath("//a[@href='/collections/wireless-bluetooth-headphones121']");
    By wirelessAndHeadphonePageTitle =By.xpath("//h1[text()='Wireless & Bluetooth Headphones']");

    SendKeysWrapper sendKeysWrapper;
    ClickWrapper clickWrapper;

    public HomeStore18WirelessAndHeadphonePage(WebDriver driver){
        this.driver = driver;
        this.sendKeysWrapper = new SendKeysWrapper(driver);
        this.clickWrapper = new ClickWrapper(driver);
    }


    public void clickOnHeadphonesTab() {
        clickWrapper.clickWithMessageAndFailTestCase(headphoneMenu, "Headphone menu", "HomePageFailed.png");

    }

    public void iClickOnWirelessAndBluetoothHeadphoneSubMenu() {
        clickWrapper.clickWithMessage(wireLessAndBluetoothHeadphoneSubMenu, "sub-menu", "SubMenuFailed.png");

    }

    public void userShouldBeRedirectedToTheWirelessAndBluetoothHeadphonesSection() {
        LoggerHelper.info("I am trying to capture the title of the headphone page");
        String title = driver.findElement(wirelessAndHeadphonePageTitle).getText();
        Assert.assertEquals("Wireless & Bluetooth Headphones", title);
        LoggerHelper.info("I am done to capture the title of the headphone page");
    }
}

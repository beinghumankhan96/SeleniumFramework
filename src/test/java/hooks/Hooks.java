package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import libraries.LoggerHelper;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {

    // Making driver public static so it can be accessed by step definitions
    public static WebDriver driver;

    /*@Before
    public void setUp() {

        LoggerHelper.info("===== Launching Browser =====");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://example.com"); // Default page
    }*/

    /*@After
    public void tearDown() {
        LoggerHelper.info("===== Closing Browser =====");
        if (driver != null) {
            driver.quit();
        }
    }*/

    @BeforeAll
    public static void setUp() {
        String browser = System.getProperty("browser","chrome");
        LoggerHelper.info("===== Launching "+browser+" Browser =====");

        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                //throw new RuntimeException("Unable to launch the browser as user has not given a proper type to proceed");
                //driver.get("https://example.com"); // Default page
                throw new RuntimeException("Invalid browser type: " + browser);
        }
        LoggerHelper.info("Maximizing the browser");
        driver.manage().window().maximize();
        LoggerHelper.info("Launch and maximiztion done in hooks");
    }

    @AfterAll
    public static void tearDown() {
        LoggerHelper.info("===== Closing Browser =====");
        if (driver != null) {
            driver.quit();
        }
    }

    @After
    public void tearDown(Scenario scenario) {
        LoggerHelper.info("Prcoeeding with tear down");
        if (scenario.isFailed()) {
            // Capture screenshot
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        LoggerHelper.info("Done with with tear down");

    }

}

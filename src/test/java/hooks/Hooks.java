package hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {

    // Making driver public static so it can be accessed by step definitions
    public static WebDriver driver;

    /*@Before
    public void setUp() {

        System.out.println("===== Launching Browser =====");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://example.com"); // Default page
    }*/

    /*@After
    public void tearDown() {
        System.out.println("===== Closing Browser =====");
        if (driver != null) {
            driver.quit();
        }
    }*/

    @BeforeAll
    public static void before_all() {
        String browser = System.getProperty("browser");
        System.out.println("===== Launching "+browser+" Browser =====");

        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Unable to launch the browser as user has not given a proper type to proceed");
                //driver.get("https://example.com"); // Default page
        }
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void after_all() {
        System.out.println("===== Closing Browser =====");
        if (driver != null) {
            driver.quit();
        }
    }
}

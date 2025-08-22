package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/HomeStore18Login.feature",
        glue = {"stepdefinitions", "hooks"},
        plugin = {
                "pretty",
                "html:target/cucumber-html-report.html",   // generates HTML
                "json:target/cucumber.json"            // generates JSON
        },
       // strict=true,
        monochrome = true
)

public class TestRunner {
}

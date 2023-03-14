package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-report.html"},
        features = {"src/test/resources/features/Login.feature"},
//        features = {"src/test/resources/features/Customers.feature"},
//        features = {"src/test/resources/features/Customers.feature",
//                "src/test/resources/features/Login.feature"},
        glue = "stepDefinitions",
        monochrome = true,
        //dryRun = true
        tags = "@sanity"
)
public class TestRunner {
}

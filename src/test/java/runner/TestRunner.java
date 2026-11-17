package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"Steps"},
        monochrome = true,
        dryRun = false,
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/jsonReports/cucumber-report.json"}

//        tags = "@sanity"


)
public class TestRunner extends AbstractTestNGCucumberTests {
}

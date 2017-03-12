package daggerok;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:.",
        glue = "classpath:daggerok",
        // plugin = "html:target/cucumber"
        plugin = {
                "html:build/cucumber/report.html",
                "json:build/cucumber/report.json"
        }
)
public class CucumberTest {}

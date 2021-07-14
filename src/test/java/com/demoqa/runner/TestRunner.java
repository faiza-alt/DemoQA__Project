package com.demoqa.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty","html:target/cucmber/reports.html"},
        features = {"src/test/resources/features"},
        glue = {"com/demoqa"},
        dryRun = false

)
public class TestRunner extends AbstractTestNGCucumberTests {
}

package TesttRunrrrr;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/Features" }, plugin = {
		"json:target/cucumber.json" }, glue = "SteepDefin")

//tags= {""})

public class TesttRuunner extends AbstractTestNGCucumberTests {

}

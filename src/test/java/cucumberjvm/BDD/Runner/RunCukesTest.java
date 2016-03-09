package cucumberjvm.BDD.Runner;

import cucumber.api.testng.AbstractTestNGCucumberTests;

import cucumber.api.CucumberOptions;

//@CucumberOptions(plugin = "json:target/cucumber-report.json")
@CucumberOptions(
		features="..\\cucumberjvm\\src\\test\\java\\cucumberjvm\\BDD\\Features\\",
		//SecondFeature
		//features="D:\Baranee\Testing\Java\cucumberjvm\src\test\java\cucumberjvm\BDD\Features",
glue = "cucumberjvm.BDD.Defenition",
dryRun = false,
strict = true,
//tags = {"@web", "@second", "@secondfeatures1"},
tags = {"@search"},
plugin = {
"pretty",
  "html:target/html",
  "json:target/cucumber.json"
})

public class RunCukesTest   extends AbstractTestNGCucumberTests {

}

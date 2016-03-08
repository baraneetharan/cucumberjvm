package cucumber.BDD.Runner;

import cucumber.api.testng.AbstractTestNGCucumberTests;

import cucumber.api.CucumberOptions;

//@CucumberOptions(plugin = "json:target/cucumber-report.json")
@CucumberOptions(
		features="..\\cucumber\\src\\test\\java\\cucumber\\BDD\\Features\\",
		//SecondFeature
		//features="D:\\Nithya\\cucumber\\src\\test\\java\\cucumber\\BDD\\Features\\FirstFeature",
glue = "cucumber.BDD.Defenition",
dryRun = false,
strict = true,
//tags = {"@web", "@second", "@secondfeatures1"},
tags = {"@sample"},
plugin = {
"pretty",
  "html:target/html",
  "json:target/cucumber.json"
})

public class RunCukesTest   extends AbstractTestNGCucumberTests {

}

package cucumber.BDD.Defenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Feature2 extends AbstractPageStepDefinotion {
	@Given("^sample feature2 file is ready$")
	public void sample_feature_file_is_ready() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("feature2 hai 1");
		driver.get("https://www.bing.com/");
		driver.findElement(By.id("sb_form_q")).sendKeys("Junit");
		driver.findElement(By.id("sb_form_go")).click();
	}

	@When("^I run the feature2 file$")
	public void i_run_the_feature_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("feature2 hai 2");
		
	}

	@Then("^run should successful$")
	public void run_should_be_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("feature2 hai 3");
	}

	@Given("^I am at Feature2$")
	public void I_am_out_of_control() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 //       System.out.println(table.getGherkinRows().size());
       // int len = table.getGherkinRows().size();
       // List<List<String>> data = table.raw();

       // System.out.println(data);

        //for (int i = 0; i <= len; i++) {

          //  System.out.println(data.get(i).get(i - 1));

        //}
		
		Assert.assertEquals("ABC","ABC");
		
		
	}
}

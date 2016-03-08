package cucumber.BDD.Defenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Feature1 extends AbstractPageStepDefinotion {
	  @Given("^sample feature file is ready$")
		public void sample_feature_file_is_ready() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("hai 1");
			driver.get("https://www.google.co.in/");
			driver.findElement(By.name("q")).sendKeys("TestNGwithcucumber");
			//driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[3]/div/input[3]")).sendKeys("TestNG");
			Thread.sleep(5000);
			driver.findElement(By.name("btnK")).click();			
		}

		@When("^I run the feature file$")
		public void i_run_the_feature_file() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("hai 2");
		}

		@Then("^run should be successful$")
		public void run_should_be_successful() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("hai 3");
		}

		@Given("^I am out of control$")
		public void I_am_out_of_control() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("hai 1");
			Assert.assertEquals("XYZ","XYZ");
			
			
		}
}

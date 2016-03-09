package cucumberjvm.BDD.Defenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class search extends AbstractPageStepDefinotion {
	@Given("^that I have gone to the Google page$")
    public void that_i_have_gone_to_the_google_page() {
		/*driver.get("https://www.bing.com/");
		driver.findElement(By.id("sb_form_q")).sendKeys("Junit");
		driver.findElement(By.id("sb_form_go")).click();*/
		System.out.println("Given");
    }

    @When("^I go to the Google search page, and search for an item,$")
    public void i_go_to_the_google_search_page_and_search_for_an_item() {
    	System.out.println("When");
    }

    @When("^I add \"([^\"]*)\" to the search box$")
    public void i_add_something_to_the_search_box(String strArg1)  {
    	System.out.println("When2");
    }

    @Then("^\"([^\"]*)\" should be mentioned in the results$")
    public void something_should_be_mentioned_in_the_results(String strArg1)  {
    	System.out.println("Then");
    }

    @And("^click the Search Button$")
    public void click_the_search_button() {
    	System.out.println("then and");
    }
}

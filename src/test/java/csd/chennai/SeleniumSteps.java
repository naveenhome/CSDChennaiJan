package csd.chennai;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeleniumSteps {
	private WebDriver driver = new FirefoxDriver();
	@Given("^user enter (\\d+) and (\\d+)$")
	public void user_enter_and(int arg1, int arg2) throws Throwable {
		driver.get("http://ata123456789123456789.appspot.com/");
	    driver.findElement(By.id("ID_nameField1")).clear();
	    driver.findElement(By.id("ID_nameField1")).sendKeys(arg1+"");
	    driver.findElement(By.id("ID_nameField2")).clear();
	    driver.findElement(By.id("ID_nameField2")).sendKeys(arg2+"");
	}

	@Given("^select \"([^\"]*)\"$")
	public void select(String arg1) throws Throwable {
		if (arg1.equals("Add"))
		{
			driver.findElement(By.id("gwt-uid-1")).click();
		}
		else if (arg1.equals("Multi"))
		{
			driver.findElement(By.id("gwt-uid-2")).click();
		}
	}

	@When("^click on button \"([^\"]*)\"$")
	public void click_on_button(String arg1) throws Throwable {
		driver.findElement(By.id("ID_calculator")).click();
	}

	@Then("^result should be (\\d+)$")
	public void result_should_be(int arg1) throws Throwable {
		String result = driver.findElement(By.id("ID_nameField3")).getAttribute("value");
	    System.out.println(driver.findElement(By.id("ID_nameField3")).getAttribute("id"));
	    assertEquals(arg1, Integer.parseInt(result));
	    driver.close();
	}
}

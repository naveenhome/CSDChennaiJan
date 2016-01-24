package csd.chennai;

import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps extends TestCase {
	Ride ride;
	String actionButton;
	@Given("^employee enter all valid data$")
	public void inputWithoutData() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    ride = new Ride();
	    ride.setName("Naveen");
	    
	    
	}

	@When("^Click on \"([^\"]*)\"$")
	public void Click_on(String button) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    actionButton= button;
	}

	@Then("^System display \"([^\"]*)\"$")
	public void System_display(String message) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    if(actionButton.equals("Submit"))
	    {
	    	RideBLL obj = new RideBLL();
	    	assertEquals(message, obj.Validate(ride));
	    }
	}

	@Given("^employee enter name as \"([^\"]*)\" Phone as \"([^\"]*)\", email as \"([^\"]*)\" and origin is \"([^\"]*)\" and destination is \"([^\"]*)\" and time is \"([^\"]*)\"$")
	public void inputWithData(String name, String phone, String email, String origin, String desti, String time) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride = new Ride();
		ride.setName(name);
		
	}


}

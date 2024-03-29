package day6;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngarcitecture {
	// vennila test cases
	// positive test cases
	// valid user name and password a user can able to login
	// step 1: launch the browser
	// step 2; put url
	// step 3: valid user name and password
	// step 4: check whether we have logged in 
	//step 5: close the browser

	// before test 
	// before method
	// test
	// after method
	// after test
	@BeforeTest
	public void setupbrowser() {
		basemethods.setup();
	}
	@BeforeMethod
	public void  puturl() {
		basemethods.puturl();
	}
	@Test
	public void tco1usernameandpassword() {
		basemethods.validenterusernameandpassword();
	}
	@AfterMethod
	public void validationcheck() throws IOException, InterruptedException {
		basemethods.validationcheck();
		Thread.sleep(4000);
		basemethods.screenshot("valid username and password check");
	}
	@AfterTest
	public void closeup() {
		basemethods.teardown();
	}
// create a method in separate class
}

package step_definitions;

import static org.junit.Assert.assertEquals;


import Pages.EmployeeLoginPage;
import Pages.HomePage;
import Pages.LandingPage;
import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//alt + crtl + o to import library

public class TestDef_Login_Functionalities extends Base{
	
	LandingPage landingPage = new LandingPage();
	EmployeeLoginPage empLogin = new EmployeeLoginPage();
	HomePage homePage = new HomePage();
	
	@Given("I am in Landing page")
	public void i_am_in_Landing_page() {
	   landingPage.navigateURL();
	}

	@When("I click on Login Menu")
	public void i_click_on_Login_Menu() {
	   landingPage.clickLoginBtn();
	}

	@Then("Verify I am in Employee Login Page")
	public void verify_I_am_in_Employee_Login_Page() {
		
		soft.assertThat("Employee Login").isEqualTo(empLogin.getEmployeeLoginLabel());
		
		
	
		//assertEquals("Employee LoginWWW", empLogin.getEmployeeLoginLabel());
		System.out.println("Debug"+empLogin.getEmployeeLoginLabel()+"1"+"1"+"1");
		
	
	}

	@Then("I enter User Id")
	public void i_enter_User_Id() {
	   empLogin.enterUserName("testpilot@gmail.com");
	}

	@Then("I enter Password")
	public void i_enter_Password() {
	   empLogin.enterPassword("1234");
	}

	@Then("click on login Button")
	public void click_on_login_Button() {
	    empLogin.clickLogin();
	}

	@Then("I will be in my home page")
	public void i_will_be_in_my_home_page() {
	   assertEquals("Welcome Test",homePage.getWelcomeText());
	}

}

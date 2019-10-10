package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pojo.Login;

public class LoginStep extends BaseClass {
	
	Login l=new Login();
	@When("User has to enter {string},{string},{string} and click loginin")
	public void user_has_to_enter_and_click_loginin(String string, String string2, String string3) {
		implicit();
		click(l.getSighupClk());
		type(l.getUserTxt(),string);
		type(l.getBemaiTxt(),string2);
		type(l.getPassTxt(),string3);
		click(l.getBtnClk());

	}

	@Then("when user enter incorrect details,user should not able to register")
	public void when_user_enter_incorrect_details_user_should_not_able_to_register() {
		Assert.assertTrue(driver.getCurrentUrl().equals("https://www.slideegg.com/"));
	}

	@When("User has to enter {string},{string} and click login")
	public void user_has_to_enter_and_click_login(String string, String string2) {
		implicit();
	    click(l.getSighupClk());
	    click(l.getLoginClk());
	    type(l.getUserNameTxt(),string);
	    type(l.getPassWordTxt(),string2);
	    click(l.getLoginBtnClk());
	}

	@Then("When user enters incorrect credentials,User should not able to login")
	public void when_user_enters_incorrect_credentials_User_should_not_able_to_login() {
		//Assert.assertTrue(driver.getCurrentUrl().equals("https://www.slideegg.com/"));
	}


}

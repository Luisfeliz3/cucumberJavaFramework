package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.wrappers.veryfiers;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

 

public class stepDefinitions  {
	private WebDriver driver = Hooks.getDriver();
          
 
 
	veryfiers ele = new veryfiers();
	
 	@Given("I have logged in")
	public void i_have_logged_in() {
 		ele.isDiplayed(driver, "card_container");
 		ele.isDiplayed(driver, "transaction_container");
	}
 	
	@And("I click nav bar login button") 
	public void I_click_nav_bar_login_button() {
		ele.click( driver, "navLoginButton");
	}
	
	@Then("I click on the make a payment button") 
	public void I_click_on_the_make_a_payment_button() {
		ele.click( driver, "make_a_Payment_button");
	}
	
	@Then("I should see the pay your bill container") 
	public void I_should_see_the_pay_your_bill_container() {
		ele.isDiplayed( driver, "pay_your_bill_container");
	}
	
	@Then("I click on Minimun Payment Due radio button") 
	public void I_click_on_Minimum_Payment_Due() {
		ele.click( driver, "min_payment_due_radio_button");
	}
	
	@Then("I enter minimum payment") 
	public void I_enter_minimum_payment() {
		ele.clear(driver, "dollar_input_payment_box");
		ele.sendKeys( driver, "dollar_input_payment_box","40.00");
	}
	
	@Then("I click on pay now button") 
	public void I_click_on_pay_now_button() {
		ele.click( driver, "pay_now_button");
	}
	
	
	@Then("I should see alert Thank You Payment") 
	public void I_should_see_alert() {
		ele.switchToAlertGetText(driver, "Thank You For Your Payment!");
	}
	
	@Then("I should see alert Minium Payment Submitted for this Period") 
	public void I_should_see_alert_Minium_Payment_Submitted_for_this_Period() {
		ele.switchToAlertGetText(driver, "Minium Payment Submitted for this Period");
	}
	
	@Then("I click on Pay Statement Balance radio button") 
	public void I_click_on_Pay_Statement_Balance_radio_button() {
		ele.click(driver,"pay_statement_balance_radio_button");
	}
 
	
	@Then("I enter Minimun Payment Due {string}")
	public void I_enter_minimun_payment_due(String payment) {
		ele.clear(driver, "dollar_input_payment_box");
		ele.sendKeys( driver, "dollar_input_payment_box",payment);
	}


	@Then("I should see alert Minimun Payment Due {string}")
	public void i_should_see_alert_minimun_payment_due(String string) {
		ele.switchToAlertGetText(driver, string);
	}

	@Then("I should see alert Pay Statement Balance {string}")
	public void i_should_see_alert_pay_statement_balance(String string) {
		ele.switchToAlertGetText(driver, string);
	}
 

	@Then("I should see alert Pay Total Balance {string}")
	public void i_should_see_alert_pay_total_balance(String string) {
		ele.switchToAlertGetText(driver, string);
	}

	@Then("I should see alert Pay Other Amount {string}")
	public void i_should_see_alert_pay_other_amount(String string) {
		ele.switchToAlertGetText(driver, string);
	}
	
		

	@Then("I enter Pay Statement Balance {string}")
	public void I_enter_pay_statement_balance(String payment) {
		ele.clear(driver, "dollar_input_payment_box");
		ele.sendKeys( driver, "dollar_input_payment_box",payment);
	}

	 
 
	@Then("I click on Pay Other Amount radio button") 
	public void I_click_on_Pay_Other_Amount_radio_button() {
		ele.click(driver,"pay_other_amount_radio_button");
	}
	
	@Then("I click on Pay Total Balance radio button")
	public void i_click_on_pay_total_balance_radio_button() {
		ele.click(driver,"pay_total_balance_radio_button");
	}

	
	@Then("I enter Pay Total Balance {string}")
	public void I_enter_Pay_Total_Balance(String payment) {
		ele.clear(driver, "dollar_input_payment_box");
		ele.sendKeys( driver, "dollar_input_payment_box",payment);
	}
	
	@Then("I enter Pay Other Amount {string}")
	public void I_enter_Pay_Other_Amount(String payment) {
		ele.clear(driver, "dollar_input_payment_box");
		ele.sendKeys( driver, "dollar_input_payment_box",payment);
	}
	
}

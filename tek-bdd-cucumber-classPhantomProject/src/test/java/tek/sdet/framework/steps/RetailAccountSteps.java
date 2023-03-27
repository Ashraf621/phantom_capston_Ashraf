package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
//	@When("User click on Account option")
//	public void UserClickOnAccountOption() throws InterruptedException {
//	  click(factory.homePage().accountOption);
//	  logger.info("User click on Account option");
//	  Thread.sleep(5000);
	
	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phoneNumber) {
	  clearTextUsingSendKeys(factory.accountPage().nameInput);
	  sendText(factory.accountPage().nameInput, name);
	  clearTextUsingSendKeys(factory.accountPage().phoneInput);
	  sendText(factory.accountPage().phoneInput, phoneNumber);
	  logger.info("User update Name ‘NameValue’ and Phone ‘PhoneValue’");
	  //Thread.sleep(3000);
	}
	@And("User click on Update button")
	public void userClickOnUpdateButton() {
	  click(factory.accountPage().updateButton);
	  logger.info("User click on signUp button");
	}
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
	    waitTillPresence(factory.accountPage().personalInfoUpdateMessage);
	    Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateMessage));
	    logger.info("user is logged into account page");
	}
	
	
	// Bellow is the methods for User can update Password and we have Click methods for both
	// up and bellow methods============================================================================================

	@When("User click on Account option")
	public void UserClickOnAccountOption() {
	  click(factory.homePage().accountOption);
	  logger.info("User click on Account option");
	  
	}
	@And("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().PreviousPassInput, data.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPassInput, data.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPassInput, data.get(0).get("confirmPassword"));
		logger.info("User enter below information");
	}
	@And("User click on Change Password button")
	public void UserClickOnChangePasswordButton() {
	  click(factory.accountPage().changePassButton);
	  logger.info("User click on Change Password button");
	}
	@Then("a message should be displayed 'Password Updated Successfully'")
	public void PasswordUpdatedSuccessfully() {
	    waitTillPresence(factory.accountPage().PassUpdatedSuccessfully);
	    Assert.assertTrue(isElementDisplayed(factory.accountPage().PassUpdatedSuccessfully));
	    logger.info("a message should be displayed 'Password Updated Successfully'");
	    
	
	}
// bellow is the methods for Add payment Scenario===============================================================================

    @And("User click on Add a payment method link")
    public void UserClickOnAddAPaymentMethodLink()  {
    	click(factory.accountPage().AddPaymentLink);
    	logger.info("User click on Add a payment method link");
    	
    }
    	
    	
    	@And("User fill Debit or credit card information")
    	public void UserFillDebitOrCreditCardInformation(DataTable dataTable) {
    		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
    		sendText(factory.accountPage().CardNumInput, data.get(0).get("cardNumber"));
    		sendText(factory.accountPage().NameOnCard, data.get(0).get("nameOnCard"));
    		sendText(factory.accountPage().ExpMonthInput, data.get(0).get("expirationMonth"));
    		sendText(factory.accountPage().ExpYearInput, data.get(0).get("expirationYear"));
    		sendText(factory.accountPage().SecurityCodeInput, data.get(0).get("securityCode"));
    		logger.info("User fill Debit or credit card information");
    	}
    		
    	@And("User click on Add your card button")
    	public void UserClickOnAddYourCardButton() {
    		click(factory.accountPage().AddCardBtn);
    		logger.info("User click on Add your card button");
    		
    		
    	}
    		
    		@Then("a message should be displayed 'Payment Method added successfully'")
    		public void PaymentMethodAddedSuccessfully() {
    			 waitTillPresence(factory.accountPage().PaymentMethodAddedSuccessfully);
    			    Assert.assertTrue(isElementDisplayed(factory.accountPage().PaymentMethodAddedSuccessfully));
    			    logger.info("a message should be displayed 'Payment Method added successfully'");
    		}
//    	@And("User click on remove option of card section")
//    	public void UserClickOnRemoveOptionOfCardSection() {
//    		click(factory.accountPage().CardSection);
//    		click(factory.accountPage().RemoveBtn);
//    		logger.info("User click on remove option of card section");
    	
    		// Bellow is Add address Methods ============================================================================
    	
    		@And("User click on Add address option")
    		public void UserClickOnAddAddressOption() {
    			click(factory.accountPage().addAddressbtn);
    			logger.info("User click on Add address option");
    			
    		}
    		
    		@And("User fill new address form with below information")
    		public void userFillThenewAddressForm(DataTable dataTable) {
    		    List < Map < String, String >> data = dataTable.asMaps(String.class, String.class);
    		    selectByVisibleText(factory.accountPage().countrydropDown, data.get(0).get("country"));
    		    sendText(factory.accountPage().fullNameInput, data.get(0).get("fullName"));
    		    sendText(factory.accountPage().phoneNumberInput, data.get(0).get("phoneNumber"));
    		    sendText(factory.accountPage().streetInput, data.get(0).get("streetAddress"));
    		    sendText(factory.accountPage().apartmentInput, data.get(0).get("apt"));
    		    sendText(factory.accountPage().cityInput, data.get(0).get("city"));
    		    selectByVisibleText(factory.accountPage().account__address_state, data.get(0).get("state"));
    		    sendText(factory.accountPage().zipCodeInput, data.get(0).get("zipCode"));
    		    logger.info("user filled the address form");
    			}
    	    		
    	    	@And("User click Add Your Address button")
    	    	public void UserClickAddYourAddressButton() {
    	    		click(factory.accountPage().addYourAddressBtnUpdate);
    	    		logger.info("User click Add Your Address button");
    	    	}
    	    	
    	    	@Then("a message should be displayed 'Address Added Successfully'")
    	    	public void AddressAddedSuccessfully() {
       			 waitTillPresence(factory.accountPage().addressAddedSuccessfully);
       			    Assert.assertTrue(isElementDisplayed(factory.accountPage().addressAddedSuccessfully));
       			    logger.info("a message should be displayed 'Address Added Successfully'");
    	    	
    		
    		}
    	    	// New Edit Dibet ==============================================================================
    	    	@And("User click on Edit option of card section")
    	    	public void userClickOnEditOptionOfCardSection() {
    	    	  click(factory.accountPage().cardthatsNeedstoBeUpdated_Or_Removed);
    	    	  waitTillPresence(factory.accountPage().editbtnForCard);
    	    	  click(factory.accountPage().editbtnForCard);
    	    	  logger.info("user Clicked on edit button");
    	    	}
    	    	@And("user edit information with below data")
    	    	public void userEditInformationWithBelowDatta(DataTable dataTable) {
    	    	  List < Map < String, String >> data = dataTable.asMaps(String.class, String.class);
    	    	  clearTextUsingSendKeys(factory.accountPage().CardNumInput);
    	    	  sendText(factory.accountPage().CardNumInput, data.get(0).get("cardNumber"));
    	    	  clearTextUsingSendKeys(factory.accountPage().nameInput);
    	    	  sendText(factory.accountPage().NameOnCard, data.get(0).get("nameOnCard"));
    	    	  selectByVisibleText(factory.accountPage().ExpMonthInput, data.get(0).get("expirationMonth"));
    	    	  selectByVisibleText(factory.accountPage().ExpYearInput, data.get(0).get("expirationYear"));
    	    	  clearTextUsingSendKeys(factory.accountPage().SecurityCodeInput);
    	    	  sendText(factory.accountPage().SecurityCodeInput, data.get(0).get("securityCode"));
    	    	  logger.info("The Data has been updated");
    	    	}
    	    	@And("user click on Update Your Card button")
    	    	public void userClickOnupdateYourCardbutton()  {
    	    	  click(factory.accountPage().UpdatebtnForCard);
    	    	  logger.info("the user clicked in update card button");
    	    
    	    	}
    	    	@Then("a message should be displayed ‘Payment Method updated Successfully’")
    	    	public void paymentMehtodUpdatedSuccessfully() {
    	    	  waitTillPresence(factory.accountPage().paymentMethodUpdated);
    	    	  Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodUpdated));
    	    	  logger.info("Payment Method updated Successfully");
    	    	}
    	    	
    	    	// Remove Debit or credit card methods===============================================================
    	    	@And("User click on remove option of card section")
    	    	public void userClickOnRemovebtn() {
    	    	  click(factory.accountPage().cardthatsNeedstoBeUpdated_Or_Removed);
    	    	  waitTillPresence(factory.accountPage().removeBtnForCard);
    	    	  click(factory.accountPage().removeBtnForCard);
    	    	  logger.info("the card has been removed");
    	    	}
    	    	@Then("payment details should be removed")
    	    	public void paymentDetailsShouldbeRemoved() {
    	    	    //Thread.sleep(5000);
    	    	    logger.info("The Card has been removed");
    	    	}
    	    	
    	    	// Verify user can Edit Address=======================================================================
    	    	
    	    	 @And ("User click on edit address option")
    	    	 public void UserClickOnAddressOption() {
    	    		 click(factory.accountPage().AddressEditBtn);
    	    		 logger.info("user click on edit address option");
    	    	 }
    	    	 @And ("user fill new address form with below information")
    	    	 public void UserFillNewAddressFormWithBelowInformation(DataTable DataTable) {
    	    		 List < Map < String, String >> data = DataTable.asMaps(String.class, String.class); 
    	    		 selectByVisibleText(factory.accountPage().countrydropDown, data.get(0).get("country"));
    	    		 clearTextUsingSendKeys(factory.accountPage().fullNameInput);
    	    		 sendText(factory.accountPage().fullNameInput, data.get(0).get("fullName"));
    	    		 clearTextUsingSendKeys(factory.accountPage().phoneNumberInput);
    	    		 sendText(factory.accountPage().phoneNumberInput, data.get(0).get("phoneNumber"));
    	    		 clearTextUsingSendKeys(factory.accountPage().streetInput);
    	    		 sendText(factory.accountPage().streetInput, data.get(0).get("streetAddress"));
    	    		 clearTextUsingSendKeys(factory.accountPage().apartmentInput);
    	    		 sendText(factory.accountPage().apartmentInput, data.get(0).get("apt"));
    	    		 clearTextUsingSendKeys(factory.accountPage().cityInput);
    	    		 sendText(factory.accountPage().cityInput, data.get(0).get("city"));
    	    		 selectByVisibleText(factory.accountPage().account__address_state, data.get(0).get("state"));
    	    		 clearTextUsingSendKeys(factory.accountPage().zipCodeInput);
    	    		 sendText(factory.accountPage().zipCodeInput, data.get(0).get("zipCode"));
    	    		 logger.info("user fill new address form with below information"); 
    	    		 //Thread.sleep(5000);
    	    	 }
    	    	 
    	    	 @And ("User click update Your Address button")
    	    	 public void UserClickUpdateYourAddressButton() {
    	    		 click(factory.accountPage().UpdateAddButton);
    	    		 logger.info("User click update Your Address button");
    	    		
    	    	 }
    	    	 @Then ("a message should be displayed {string}")
    	    	 public void aMessageShouldBeDisplayed(String string) {
    	    		 waitTillPresence(factory.accountPage().AddressUpdatedSuccessfully);
    	    		 Assert.assertTrue(isElementDisplayed(factory.accountPage().AddressUpdatedSuccessfully));
    	    		 logger.info("Address Updated Successfully");
    	    	 }
    	    	 // Verify User can remove Address from Account=============================================================
    	    	 
    	    	 @And ("User click on remove option of Address section")
    	    	 public void UserClickOnRemoveOptionOfAddressSection() throws InterruptedException {
    	    		 click(factory.accountPage().AddressRemoveBtn);
    	    		 logger.info("User click on remove option of Address section");
    	    		 Thread.sleep(5000);
    	    		
    	    	 }
    	    	 @Then ("Address details should be removed")
    	    	 public void AddressDetailsShouldBeRemoved() {
    	    		 logger.info("Then Address details should be removed");
    	    	 }
    	    	    
    	    	}
    	    	
    	    	

    


































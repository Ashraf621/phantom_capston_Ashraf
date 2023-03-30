package tek.sdet.framework.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{
	POMFactory factory = new POMFactory();
	
	
	
	@And("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().orderSection);
		logger.info("User click on Orders section");  
	}
	@And("User click on first order in list")
	public void userClickOnFirstOrderInList() {
	    click(factory.orderPage().firstOrder);
	    logger.info("User click on first order in list");
	}
	@And("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelOrder);
		logger.info("User click on Cancel The Order button");
	}
	@And("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReasonBoughtWrongItem(String String) {
		 click(factory.orderPage().CancelReason);
		  Select selectBox = new Select((WebElement) factory.orderPage().CancelReason);
		  selectBox.selectByVisibleText("Bought wrong item");
		  logger.info("user selected the cancellation reason");
	}
	@And("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
	   click(factory.orderPage().canelOrderBtn);
	   logger.info("User click on Cancel Order button");
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled(String String) {
		 waitTillPresence(factory.orderPage().YourOrderHasBeenCancelled);
		  Assert.assertTrue(isElementDisplayed(factory.orderPage().YourOrderHasBeenCancelled));
		  logger.info("order cancelled");
	   
	}
//	Scenario: Verify User can Return the order==========================================================
	
	
	@And("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnBtn);
		logger.info("User click on Return Items button");
	    
	}
	@And ("User select the Return Reason {string}")
	public void userSelectTheReturnReasonItemDamaged(String String)  {
		click(factory.orderPage().returnReasonInput);
		Select selectBox = new Select((WebElement)factory.orderPage().returnReasonInput);
		selectBox.selectByVisibleText("Item damaged");
		logger.info("User select the Return Reason 'Item damaged'");
		
	   
	}
	 @And ("User select the drop off service {string}")
	public void userSelectTheDropOffServiceFedEx(String String)  {
		click(factory.orderPage().dropOffInput);
		Select selectBox = new Select((WebElement)factory.orderPage().dropOffInput);
		selectBox.selectByVisibleText("FedEx");
			logger.info("User select the drop off service 'FedEx'");
			
	    
	}
	@And("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnOrder);
		logger.info("User click on Return Order button");
		
	    
	}
	@Then("a cancelation message shouldd be displayed {string}")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful(String String) throws InterruptedException {
		waitTillPresence(factory.orderPage().returnOrder);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().returnOrder));
		logger.info("order returned");
		Thread.sleep(3000);
	   
	}





						
						
						
//        //Scenario: Verify User can write a review on order placed============================================================================
		
		
		@When("User click on Review button")
		public void UserClickOnReviewButton() throws InterruptedException {
				click(factory.orderPage().reviewBtn);
				logger.info("User clicked on review button");
					Thread.sleep(3000);
		}
							
		@When("User write Review headline {string} and {string}")
		public void userWriteReviewHeadlineAnd(String string, String string2) throws InterruptedException {
				sendText(factory.orderPage().addHeadlin, string);
					Thread.sleep(3000);
				sendText(factory.orderPage().addWritten, string2);
				logger.info("User clicked added headline value and review text");
		}
							
	@And("User click Add your Review button")
		public void UserClickAddYourReviewButton() throws InterruptedException {
				click(factory.orderPage().addYourReview);
				logger.info("User clicked on add review button");
					Thread.sleep(5000);
										
		}									
							
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String string) {
				waitTillPresence(factory.orderPage().yourReviewWassAddedSuccessfully);
			Assert.assertTrue(isElementDisplayed(factory.orderPage().yourReviewWassAddedSuccessfully));
					logger.info("your review as added is displayed");
										
		}
		
}
						

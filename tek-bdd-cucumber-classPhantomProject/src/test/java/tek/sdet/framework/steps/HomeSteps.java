package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;


public class HomeSteps extends CommonUtility {
	
	
	POMFactory factory = new POMFactory();
	
	
	
	 @When("User click on All section")
		public void userClickOnAllSection() {
		 click(factory.homePage().AllElements);
		 logger.info("User click on All section");
	 }
			 	 
	 @And("User on {string}")
	 public void userOnDepartment(String department) {
		 
		 List <WebElement> dept = factory.homePage().sideBar;
		 
		 for(WebElement element : dept) {
			 
			 
			 if(element.getText().equals(department)) {
				 
				 
				 element.click();
				 break;
			 }
	
		 }
		  
	 }
	 @Then("below options are present in department")
	 public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		 
		 
		 List<List<String>> departmentSection = dataTable.asLists(String.class);
		 
		 List<WebElement> dept = factory.homePage().sideBar;
		 for (int i = 0; i < departmentSection.get(0).size(); i++) {
			 for (WebElement element: dept) {
				 if(element.getText().equals(departmentSection.get(0).get(i))) {
					 Assert.assertTrue(element.isDisplayed());
					 logger.info(element.getText()+"The item is present");
				 }
			 }
		 }
	 }
		 // Scenario: Verify User can add an item to cart========================================================
	
	 //Scenario: Verify User can place an order without Shipping address and payment Method on file===========================
	 
	 @And("User change the category to {string}")
	 public void userChangeTheCategoryTo(String catagory) {
	   //selectByVisibleText(factory.homePage().selectCatagory.getAccessibleName("string"));
	   Select selectBox = new Select((WebElement) factory.homePage().selectCatagory);
	   selectBox.selectByVisibleText(catagory);
	   //System.out.println(catagory);
	   logger.info("user clicked on catagory to change it");
	 }
	 @And("User search for an item {string}")
	 public void user_search_for_an_item1(String searchField) {
	   sendText(factory.homePage().searchBarInput, searchField);
	   logger.info("user searched for the item");
	 }
	 @And("User click on Search icon")
	 public void user_click_on_search_icon1() {
	   click(factory.homePage().searchBtn);
	   logger.info("user clicked on search button");
	 }
	 @And("User click on item")
	 public void userClickOnItem() throws InterruptedException {
	   click(factory.homePage().Item);
	   logger.info("user clicked one the item");
	   Thread.sleep(3000);
	 }
	 @And("User select quantity {string}")
	 public void user_select_quantity(String qty) {
	   selectByVisibleText(factory.homePage().qtyForproduct, qty);
	   logger.info("user selected for qty");
	 }
	 @And("User click add to Cart button")
	 public void user_click_add_to_cart_button1() {
	   click(factory.homePage().addToCart);
	   logger.info("user clicked on add to card button");
	 }
	 @Then("the cart icon quantity should change to {string}")
	 public void the_cart_icon_quantity_should_change_to(String string) {
	   waitTillPresence(factory.homePage().cardQty);
	   Assert.assertTrue(isElementDisplayed(factory.homePage().cardQty));
	   logger.info("the qty icon is changed");
	 }
	 @And("User click on Cart option")
	 public void user_click_on_cart_option() {
	   click(factory.homePage().BtnCart);
	   logger.info("user clicked on add to card option ");
	 }
	 @And("User click on Proceed to Checkout button")
	 public void user_click_on_proceed_to_checkout_button() {
	   click(factory.homePage().proceedBtn);
	   logger.info("user clicked on proceedBtn");
	 }
	 @And("User click Add a new address link for shipping address")
	 public void user_click_add_a_new_address_link_for_shipping_address() {
	   click(factory.homePage().addAddressLnk);
	   logger.info("user clicked on add new address link");
	 }
	 
	 @And("User click Add Your Address button link")
	 public void userClickOnAddCardBtnLink() {
	   click(factory.homePage().addAddressBtn);
	   waitTillPresence(factory.accountPage().addressAddedSuccessfully);
	   logger.info("User Clicked on cardButton");
	 }
	 @And("User click add a Cridet or Debit Card button for payement method")
	 public void userClickeAddACreditOrDebitCardPayMeth() {
	   click(factory.homePage().addPaymentOptBtn);
	   logger.info("user clicked on add cart Btn");
	 }
	 @And("User fill below card information")
	 public void user_fill_below_card_information(DataTable dataTable) {
	   List < Map < String, String >> data = dataTable.asMaps(String.class, String.class);
	   sendText(factory.accountPage().CardNumInput, data.get(0).get("cardNumber"));
	   sendText(factory.accountPage().NameOnCard, data.get(0).get("nameOnCard"));
	   selectByVisibleText(factory.accountPage().ExpMonthInput, data.get(0).get("expirationMonth"));
	   selectByVisibleText(factory.accountPage().ExpYearInput, data.get(0).get("expirationYear"));
	   sendText(factory.accountPage().SecurityCodeInput, data.get(0).get("securityCode"));
	   logger.info("User entered the card information");
	 }
	 @And("User click on Add card button")
	 public void userClickOnAddCardBtn() throws InterruptedException {
	   click(factory.homePage().addCardBtnPay);
	   waitTillPresence(factory.accountPage().PaymentMethodAddedSuccessfully);
	   logger.info("User Clicked on cardButton");
	   Thread.sleep(3000);
	 }
	 @And("User click on Place Your Order")
	 public void User_click_Place_Your_Order_button() throws InterruptedException {
	   click(factory.homePage().PlaceYourOrderButton);
	   logger.info("User Clicked on place order Btn");
	   Thread.sleep(2000);
	 }
	 @Then("a message should be display 'Order Placed, Thanks'")
	 public void amessageshouldbedisplayOrderPlaced() {
	   waitTillPresence(factory.homePage().orderPlacedThanks);
	   Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedThanks));
	   logger.info("Order placed,thanks");
	 }
	 //Scenario: Verify User can place an order with Shipping address and payment Method on file===========================================
	 
}

















package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//img[@alt='profile pic']")
	public WebElement accountProfilePicture;
	
	

	
	@FindBy(xpath="//*[@id=\"nameInput\"]")
	public WebElement nameInput;
	
	@FindBy (xpath ="//*[@id=\"personalPhoneInput\"]")
	public WebElement phoneInput;
	
	@FindBy(xpath ="//*[@id=\"personalUpdateBtn\"]")
	public WebElement updateButton;
	
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInfoUpdateMessage;
	
	// below is WebElements for update password============================================================================
	
	@FindBy(xpath ="//*[@id=\"previousPasswordInput\"]")
	public WebElement PreviousPassInput;
	
	@FindBy(xpath ="//*[@id=\"newPasswordInput\"]")
	public WebElement newPassInput;
	
	@FindBy(xpath ="//*[@id=\"confirmPasswordInput\"]")
	public WebElement confirmPassInput;
	
	@FindBy(xpath ="//*[@id=\"credentialsSubmitBtn\"]")
	public WebElement changePassButton;
	
	@FindBy(xpath ="//div[text()='Password Updated Successfully']")
	public WebElement PassUpdatedSuccessfully;
	
	// below is WebElements for add payment methods==========================================================================
	
	@FindBy(xpath ="//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div/div[2]/p")
	public WebElement AddPaymentLink;
	
	@FindBy(xpath ="//*[@id=\"cardNumberInput\"]")
	public WebElement CardNumInput;
	
	@FindBy(xpath ="//*[@id=\"nameOnCardInput\"]")
	public WebElement NameOnCard;
	
	@FindBy(xpath ="//*[@id=\"expirationYearInput\"]")
	public WebElement ExpYearInput;
	
	@FindBy(xpath ="//*[@id=\"expirationMonthInput\"]")
	public WebElement ExpMonthInput;
	
	@FindBy(xpath ="//*[@id=\"securityCodeInput\"]")
	public WebElement SecurityCodeInput;
	
	// Remove Debit Card Elements============================================================================================
	
	@FindBy(xpath ="//*[@id=\"paymentSubmitBtn\"]")
	public WebElement AddCardBtn;
	
	@FindBy(xpath="//div[text()='Payment Method added sucessfully']")
	public WebElement PaymentMethodAddedSuccessfully;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/button[2]")
	public WebElement RemoveBtn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[2]/p[1]")
	public WebElement CardSection;
	
	// Add Address Elements==================================================================================================
	
	
	@FindBy(xpath = "//*[@class=\"account__address-new-wrapper\"]")
	public WebElement addAddressbtn;
	
	@FindBy(xpath = "//select[@id='countryDropdown']")
	public WebElement countrydropDown;
	
	@FindBy(xpath = "//input[@id='fullNameInput']")
	public WebElement fullNameInput;
	
	@FindBy(xpath = "//input[@id='phoneNumberInput']")
	public WebElement phoneNumberInput;
	
	@FindBy(xpath = "//input[@id='streetInput']")
	public WebElement streetInput;
	
	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement apartmentInput;
	
	@FindBy(xpath = "//input[@id='cityInput']")
	public WebElement cityInput;
	
	@FindBy(xpath = "//*[@name=\"state\"]")
	public WebElement account__address_state;
	
	@FindBy(xpath = "//input[@id='zipCodeInput']")
	public WebElement zipCodeInput;
	
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement addYourAddressBtnUpdate;
	
	@FindBy(xpath = "//div[contains(text(),'Address Added Successfully')]")
	public WebElement addressAddedSuccessfully;
	
	// User Can Edit Debit -----------------------------------------------------------------------------------------
	
	@FindBy(xpath="//button[contains(text(),'Edit')]")
	public WebElement editbtnForCard;
	
	@FindBy (xpath="//button[@id='paymentSubmitBtn']")
	public WebElement UpdatebtnForCard;
	
	@FindBy(xpath ="//div[contains(text(),'Payment Method updated Successfully')]")
	public WebElement paymentMethodUpdated;
	
	@FindBy(xpath="//p[@class=('account__payment-sub-title')]")
	public WebElement cardthatsNeedstoBeUpdated_Or_Removed;
	
	// the original Remove Debit or Cridet care==================================================================
	
	@FindBy(xpath="//button[contains(text(),'remove')]")
	public WebElement removeBtnForCard;
	
	
	
	// Verify User can edit an Address added on account==========================================================
	
	@FindBy(xpath ="//button[contains(text(),'Edit')]")
	public WebElement AddressEditBtn;
	
	@FindBy(xpath ="//button[@id='addressBtn']")
	public WebElement UpdateAddButton;
	
	@FindBy(xpath ="//div[text()='Address Updated Successfully']")
	public WebElement AddressUpdatedSuccessfully;
	
	// Verify User can remove Address from Account=================================================================
	
	@FindBy(xpath ="//button[contains(text(),'Remove')]")
	public WebElement AddressRemoveBtn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}


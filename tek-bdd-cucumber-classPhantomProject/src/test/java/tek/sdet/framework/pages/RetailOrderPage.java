package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderPage extends BaseSetup{
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	
	@FindBy(xpath = "//*[@id='orderLink']") 
	public WebElement orderSection;
	
	@FindBy(xpath = "//*[@id='orderLink']") 
	public WebElement firstOrder;
	
	@FindBy(xpath = "//*[@id=\"cancelBtn\"]") 
	public WebElement cancelOrder;
	
	@FindBy(xpath = "//*[@id=\"reasonInput\"]") 
	public WebElement CancelReason;
	
	@FindBy(xpath = "//*[@id=\"orderSubmitBtn\"]") 
	public WebElement canelOrderBtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/p") 
	public WebElement YourOrderHasBeenCancelled;
	
	
	
	@FindBy(xpath = "//*[@id=\"returnBtn\"]") 
	public WebElement returnBtn;
	
	@FindBy(id = "reasonInput") 
	public WebElement returnReasonInput;
	
	@FindBy(id = "dropOffInput") 
	public WebElement dropOffInput;
	
	@FindBy(xpath = "//*[@id=\"orderSubmitBtn\"]") 
	public WebElement returnOrder;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/div/p") 
	public WebElement cancelationMessageShouldBeDisplayed;
	
	
	
	@FindBy(xpath = "//*[@id=\"reviewBtn\"]") 
	public WebElement reviewBtn;
	
	@FindBy(xpath = "//*[@id=\"headlineInput\"]") 
	public WebElement addHeadlin;
	
	@FindBy(xpath = "//*[@id=\"descriptionInput\"]") 
	public WebElement addWritten;
	
	@FindBy(xpath = "//*[@id=\"reviewSubmitBtn\"]") 
	public WebElement addYourReview;
	
	@FindBy(xpath = "//div[contains(text(),'Your review was added successfully')]") 
	public WebElement yourReviewWassAddedSuccessfully;
	}



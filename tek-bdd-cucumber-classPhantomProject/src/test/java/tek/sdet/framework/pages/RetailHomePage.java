package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
		// we are implementing PageFactory Class to initialize the UI elements 
		// using @FindBy annotation of PageFactory. 
		PageFactory.initElements(getDriver(), this);
	}

	// syntax for storing UI elements using @FindBy annotations
	// @FindBy(locatorType = "locator Value")
	// public WebElement nameOfElement
	
	@FindBy(linkText = "TEKSCHOOL") // this is same as driver.findElement() 
	public WebElement tekschoolLogo;
	
	@FindBy(id = "searchInput")
	public WebElement searchBarInput;
	
	@FindBy(id = "searchBtn")
	public WebElement searchButton;
	
	@FindBy(xpath ="//img[contains(@alt,'Pokemon')]")
	public WebElement pokemonImage;
	
	@FindBy(xpath ="//*[@id=\"signinLink\"]")
	public WebElement signInOption;
	
	@FindBy(xpath ="//*[@id=\"accountLink\"]")
	public WebElement accountOption;
	
	
	
	@FindBy(xpath = "//span[text()='All']")
	public WebElement AllElements;
	
	@FindBy(xpath = "//div[@class='sidebar_content-item']//span")
	public List<WebElement> sideBar;
	
	
	//   Scenario: Verify User can add an item to cart===================================================================
	
	
	@FindBy(xpath = "//span[contains(text(),'Electronics')]")
	public WebElement ElectronicsBtn;
	
	@FindBy(xpath = "//span[contains(text(),'Computers')")
	public WebElement ComputersBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Order Placed']")
	public WebElement orderPlaced;
	@FindBy(xpath = "//span[contains(text(),'Smart Home')]")
	public WebElement smartHomeBtn;
	//span[contains(text(),'Sports')]
	@FindBy(xpath = "//span[contains(text(),'Sports')]")
	public WebElement sportsbtn;
	@FindBy(xpath = "//span[contains(text(),'Automative')]")
	public WebElement automativeBtn;
	@FindBy(xpath = "//select[@id='search']")
	public WebElement selectCatagory;
	@FindBy(xpath = "//input[@id='searchInput']")
	public WebElement searchInput;
	@FindBy(xpath = "//button[@id='searchBtn']")
	public WebElement searchBtn;
	@FindBy(xpath = "//p[contains(text(),'Kasa Outdoor Smart Plug')]")
	public WebElement outdoorSmartPlug;
	@FindBy(xpath = "//*[@class='product__select']")
	public WebElement qtyForproduct;
	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	public WebElement addToCart;
	@FindBy(xpath = "//span[@id='cartQuantity']")
	public WebElement cardQty;
	@FindBy(xpath = "//p[contains(text(),'Cart')]")
	public WebElement BtnCart;
	@FindBy(xpath = "//button[@id='proceedBtn']")
	public WebElement proceedBtn;
	@FindBy(xpath = "//button[@id='addAddressBtn']")
	public WebElement addAddressLnk;
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement addAddressBtn;
	@FindBy(xpath = "//button[@id='addPaymentBtn']")
	public WebElement addPaymentOptBtn;
	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement addCardBtnPay;
	@FindBy(xpath = "//button[@id='placeOrderBtn']")
	public WebElement PlaceYourOrderButton;
	@FindBy(xpath = "//img[@class='image']")
	public WebElement ItemToBeClickedOn;
	@FindBy(xpath = "//p[contains(text(),'Order Placed, Thanks')]")
	public WebElement orderPlacedThanks;
	@FindBy(className = "products__layout")
	public WebElement Item;
	
	// Scenario: Verify User can place an order with Shipping address and payment Method on file============================
	
	
	
	
	
	
	
	
	
	

	
	
	
}

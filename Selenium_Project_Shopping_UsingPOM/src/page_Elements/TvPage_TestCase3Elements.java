package page_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TvPage_TestCase3Elements {
	
	@FindBy(xpath="//a[text()='TV']")
	public static WebElement Tvhome;
	
	@FindBy(xpath = "//a[@class=\"logo\"]")
	public static WebElement home;
	
	
	@FindBy(xpath="//img[@id=\"product-collection-image-5\"]")
	public static WebElement Samsungprouduct;
	
	@FindBy(xpath="//span[text()='Samsung LCD']")
	public static WebElement SamsungproductText;
	
	@FindBy(xpath="//input[@id=\"qty\"]")
	public static WebElement productuQty;
	
	@FindBy(xpath="//button[@title=\"Add to Cart\"]")
	public static WebElement AddtoCartButton;
	
	@FindBy(xpath="//span[contains(text(),'Samsung LCD was added to your shopping cart')]")
	public static WebElement CartMessage;
	
	
	@FindBy(xpath="//th[normalize-space () ='Subtotal']//following::td[6]")
	public static WebElement productTotalprice;
	
	
	@FindBy(xpath="//span[text()='Cart']")
	public static WebElement CartMenu;
	
	@FindBy(xpath="//a[@title=\"Remove This Item\"]")
	public static WebElement Removetheitem;
	
	@FindBy(xpath="//div[contains(text(),'Item was removed successfully.')]")
	public static WebElement RemoveSuccessmessage;
	
	
	@FindBy(xpath="//div/p[contains(text(),'You have no items in your shopping cart.')]")
	public static WebElement CartEmptymessage;
	

}

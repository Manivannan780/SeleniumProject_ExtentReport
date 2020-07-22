package page_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common_Functions.MyCommonFunctions;

public class MobilePage_Testcase2Elements extends MyCommonFunctions {
	
	@FindBy(xpath="//a[text()='Mobile']")
	public static WebElement homemobile;
	
	@FindBy(xpath = "//a[@class=\"logo\"]")
	public static WebElement home;
	
	@FindBy(xpath ="//h1[text()='Mobile']")
	public static WebElement mobileText;
	
	@FindBy(xpath="//img[@id=\"product-collection-image-1\"]")
	public static WebElement sonyproduct;
	
	
	@FindBy(xpath="//span[@class=\"h1\"]")
	public static WebElement SonyText;
	
	@FindBy(xpath="//dl[@id=\"collateral-tabs\"]")
	public static WebElement SonyDescription;
	
	
	@FindBy(xpath="//li[@class=\"category3\"]")
	public static WebElement Mobilehome;
	
	@FindBy(xpath="//img[@id=\"product-collection-image-2\"]")
	public static WebElement Iphoneproduct;
	
	@FindBy(xpath="//span[text()='IPhone']")
	public static WebElement IphoneText;
	
	@FindBy(xpath="//div[contains(text(),' IPhone is the one of the')]")
	public static WebElement IphoneDescrption;
	
	
	@FindBy(xpath="//img[@id=\"product-collection-image-3\"]")
	public static WebElement Samsungproduct;
	
	
	@FindBy(xpath="//span[text()='Samsung Galaxy']")
	public static WebElement SamsungText;
	
	@FindBy(xpath="//div[contains(text(),'Samsung Galaxy is a great phone by')]")
	public static WebElement SamsungDescrption;
	

}

package page_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common_Functions.MyCommonFunctions;

public class MainPage_Testcase1Elements extends MyCommonFunctions {

	@FindBy(xpath = "//a[@class=\"logo\"]")
	public static WebElement home;

	@FindBy(xpath ="//p[@class=\"welcome-msg\"]")
	public static WebElement welcomemessage;

	@FindBy(xpath ="//div[@class=\"page-title\"]")
	public static WebElement homepagetitle;

	@FindBy(xpath ="//a[text()='About Us']")
	public static WebElement Aboutus;

	@FindBy(xpath ="//h1[text()='About Magento Store']")
	public static WebElement aboutusText;

	@FindBy(xpath ="//a[text()='Contact Us']")
	public static WebElement contactus;

	@FindBy(xpath="//div[@class=\"page-title\"]//h1")
	public static WebElement contactusText;

	@FindBy(xpath="//a[@title=\"Advanced Search\"]")
	public static WebElement Advancedsearch;

	@FindBy(id = "name")
	public static WebElement brandname;
	
	@FindBy(xpath="//h2[@class=\"product-name\"]")
	public static WebElement Fetchbrandname;
	
	@FindBy(xpath="//div[@class=\"block-title\"]//following::a[8]")
	public static WebElement Myaccount;
	
	@FindBy(xpath="//h1[contains(text(),'Login or Create an Account')]")
	public static WebElement accounttext;

}

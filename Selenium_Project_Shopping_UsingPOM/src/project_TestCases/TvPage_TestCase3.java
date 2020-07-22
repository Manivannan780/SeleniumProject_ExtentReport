package project_TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import common_Functions.MyCommonFunctions;
import page_Elements.TvPage_TestCase3Elements;

public class TvPage_TestCase3 extends MyCommonFunctions {

	String SamsungText;
	String Totalprice;
	String CartMsg;
	String Removemessage;
	String CartEmptymessage;


	public void Tvpage() {
		logobject.info("Page Factory object Creation for TestCase3");
		PageFactory.initElements(driver, TvPage_TestCase3Elements.class);
		logobject.info("TV MainMenu Verification");
		TvPage_TestCase3Elements.Tvhome.click();
		driver.navigate().refresh();
	}

	public void Addtocart() {
		logobject.info("Samsung TV Verification");
		TvPage_TestCase3Elements.Samsungprouduct.click();
		SamsungText=TvPage_TestCase3Elements.SamsungproductText.getText();
		System.out.println("Product name :"+SamsungText);
		TvPage_TestCase3Elements.productuQty.clear();
		TvPage_TestCase3Elements.productuQty.sendKeys("2");
		logobject.info("Proudct Add to Cart Verification");
		TvPage_TestCase3Elements.AddtoCartButton.click();
	}
	public void productText() {
		logobject.info("Item Added Message Verification");
		CartMsg=TvPage_TestCase3Elements.CartMessage.getText();
		System.out.println("The item Added message :"+CartMsg);
		//driver.navigate().refresh();
		Totalprice=TvPage_TestCase3Elements.productTotalprice.getText();
		System.out.println("Total price of the product :"+Totalprice);
		logobject.info("Home Page Verification");
		TvPage_TestCase3Elements.home.click();

	}

	/*
	 * public void verification() {
	 * Assert.assertEquals("Samsung LCD was added to your shopping cart.", CartMsg);
	 * Assert.assertEquals("$1,400.00", Totalprice); driver.navigate().refresh();
	 * TvPage_TestCase3Elements.home.click(); }
	 */

	public void CartVerification() {
		logobject.info("Cart Verification");
		TvPage_TestCase3Elements.CartMenu.click();
		logobject.info("Item Removed from Cart Verification");
		Actions actobj=new Actions(driver);
		actobj.moveToElement(TvPage_TestCase3Elements.Removetheitem).click().build().perform();
		Alert obj1=driver.switchTo().alert();
		obj1.accept();
	}
	public void cartmessageverification() {
		logobject.info("Success message Verification after removing");
		Removemessage=TvPage_TestCase3Elements.RemoveSuccessmessage.getText();
		System.out.println("Remove Success Message :"+Removemessage);
		CartEmptymessage=TvPage_TestCase3Elements.CartEmptymessage.getText();
		System.out.println("Cart Empty Message :"+CartEmptymessage);
		TvPage_TestCase3Elements.home.click();

	}



	@Test
	public void CTestCase3() {
		testcases=extentreporter.createTest("Shoping portal TV Page Verification");
		Tvpage();
		Addtocart();
		productText();
		//verification();
		CartVerification();
		cartmessageverification();
	}

}

package project_TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import common_Functions.MyCommonFunctions;
import page_Elements.MobilePage_Testcase2Elements;

public class MobilPage_Testcase2 extends MyCommonFunctions  {

	public static String MobileText;
	public static String sonyproductname;
	public static String sonydescription;

	public static String Iphoneproductname;
	public static String Iphonedescription;

	public static String Samsungproductname;
	public static String Samsungdescription;


	public static void Mobilepage() {
		logobject.info("Page Factory object Creation for Test Case2");
		PageFactory.initElements(driver, MobilePage_Testcase2Elements.class);
		logobject.info("Mobile page Verification");
		MobilePage_Testcase2Elements.homemobile.click();
		MobileText=MobilePage_Testcase2Elements.mobileText.getText();
		System.out.println(MobileText);
		Assert.assertEquals("MOBILE", MobileText);
		driver.navigate().refresh();
	}

	public static void Sonyprouduct() {
		logobject.info("Sony Product Verification");
		MobilePage_Testcase2Elements.sonyproduct.click();
		sonyproductname=MobilePage_Testcase2Elements.SonyText.getText();
		System.out.println(sonyproductname);
		//Assert.assertEquals("SONY XPERIA", sonyproductname);

		sonydescription=MobilePage_Testcase2Elements.SonyDescription.getText();
		System.out.println(sonydescription);
		//Assert.assertEquals("this is Sony Xperia", sonydescription);
		MobilePage_Testcase2Elements.Mobilehome.click();
		driver.navigate().refresh();

	}


	public static void Iphoneproduct() {
		logobject.info("Iphone Verification");
		MobilePage_Testcase2Elements.Iphoneproduct.click();
		Iphoneproductname=MobilePage_Testcase2Elements.IphoneText.getText();
		System.out.println(Iphoneproductname);
		Assert.assertEquals("IPHONE", Iphoneproductname);

		Iphonedescription=MobilePage_Testcase2Elements.IphoneDescrption.getText();
		System.out.println(Iphonedescription);
		if(Iphonedescription.equalsIgnoreCase("IPhone is the one of the best mobile device in market")){
			MobilePage_Testcase2Elements.homemobile.click();
		}
		else {
			System.out.println("Not Equal Test Case Failed");
		}
		driver.navigate().refresh();
	}

	public static void Samsungproduct() {
		
		logobject.info("Samsung Mobile Verification");
		MobilePage_Testcase2Elements.Samsungproduct.click();
		Samsungproductname=MobilePage_Testcase2Elements.SamsungText.getText();
		System.out.println(Samsungproductname);
		Assert.assertEquals("SAMSUNG GALAXY", Samsungproductname);
		
		Samsungdescription=MobilePage_Testcase2Elements.SamsungDescrption.getText();
		System.out.println(Samsungdescription);
		driver.navigate().refresh();
		MobilePage_Testcase2Elements.home.click();
		//driver.navigate().refresh();
		/*
		 * if(Samsungdescription.
		 * equalsIgnoreCase("Samsung Galaxy is a great phone by samsung")){
		 * MobilePage_Testcase2Elements.home.click(); } else {
		 * System.out.println("Not Equal Test Case Failed"); }
		 */

	}
	
	@Test
	public static void BTestcase2() {
		testcases=extentreporter.createTest("Shoping portal Mobile Page Verification");
		Mobilepage();
		Sonyprouduct();
		Iphoneproduct();
		Samsungproduct();
	}

}

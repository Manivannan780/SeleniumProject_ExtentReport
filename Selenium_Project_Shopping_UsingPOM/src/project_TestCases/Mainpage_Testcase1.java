package project_TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import common_Functions.MyCommonFunctions;
import page_Elements.MainPage_Testcase1Elements;

public class Mainpage_Testcase1 extends MyCommonFunctions {


	public static String Welcomeoriginalmessage;

	public static String OriginalHomepageTitle;
	public static String OriginalAboutText;
	public static String OriginalContactusText;
	public static String BrandnameText;
	public static String OriginalAccountText;



	public static  void Welcomemessage() {
		//PageFactory
		
		logobject.info("PageFactory object Creation for Testcase1");
		PageFactory.initElements(driver, MainPage_Testcase1Elements.class);

		//Welcome message Verification
		logobject.info("Welcome Message Verification");
		Welcomeoriginalmessage=MainPage_Testcase1Elements.welcomemessage.getText();
		System.out.println(Welcomeoriginalmessage);
		Assert.assertEquals("DEFAULT WELCOME MSG!",Welcomeoriginalmessage );
	}

	public static  void HomepageVerification() {
		//home page Verification
		logobject.info("Homepage Title verification");
		OriginalHomepageTitle= MainPage_Testcase1Elements.homepagetitle.getText();
		System.out.println(OriginalHomepageTitle);
		//Assert.assertEquals("THIS IS DEMO SITE FOR", OriginalHomepageTitle);
	}

	public static void AboutusVerification() {
		//About us Verification
		
		logobject.info("About Us Verification");
		MainPage_Testcase1Elements.Aboutus.click();
		OriginalAboutText=MainPage_Testcase1Elements.aboutusText.getText();
		System.out.println(OriginalAboutText);
		Assert.assertEquals("ABOUT MAGENTO STORE",OriginalAboutText );
		MainPage_Testcase1Elements.home.click();
	}
	public static void ContactusVerificatin() {
		//Contact us page verification
		logobject.info("Contact Us Verification");
		MainPage_Testcase1Elements.contactus.click();
		OriginalContactusText=MainPage_Testcase1Elements.contactusText.getText();
		System.out.println(OriginalContactusText);
		Assert.assertEquals("CONTACT US",OriginalContactusText );
		MainPage_Testcase1Elements.home.click();
	}
	public static  void AdvancedSearchVerification() {
		//Advanced Search operation
		logobject.info("Advanced Search Verification");
		MainPage_Testcase1Elements.Advancedsearch.click();
		MainPage_Testcase1Elements.brandname.sendKeys("Sony"+Keys.ENTER);
		BrandnameText=MainPage_Testcase1Elements.Fetchbrandname.getText();
		System.out.println(BrandnameText);
		Assert.assertEquals("SONY XPERIA", BrandnameText);
		MainPage_Testcase1Elements.home.click();

	}		
	public static void AccountVerificatin() {        
		//Account Verification
		
		logobject.info("Account  Verification");
		MainPage_Testcase1Elements.Myaccount.click();
		OriginalAccountText=MainPage_Testcase1Elements.accounttext.getText();
		System.out.println(OriginalAccountText);
		Assert.assertEquals("LOGIN OR CREATE AN ACCOUNT",OriginalAccountText );
		MainPage_Testcase1Elements.home.click();
	}
	@Test
	public static void Atestcase1() {
		testcases=extentreporter.createTest("Shoping portal Main Page Verification");
		Welcomemessage();
		HomepageVerification();
		AboutusVerification();
		ContactusVerificatin();
		AdvancedSearchVerification();
		AccountVerificatin();
	}

}

package common_Functions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class MyCommonFunctions {

	public static WebDriver driver;
	static Properties propertyobj;
	public static ExtentReports extentreporter;
	public static ExtentHtmlReporter htmlobj;
	public static ExtentTest testcases;
	public static Logger logobject=Logger.getLogger(MyCommonFunctions.class);

	public void ExtentReport() {
		extentreporter=new ExtentReports();
		htmlobj=new ExtentHtmlReporter("ExtentReport.html");
		extentreporter.attachReporter(htmlobj);
}

	public void logerfilereading() {

		PropertyConfigurator.configure("Shoppinglog.properties");
	}

	public static Properties Readingpropertyfile() throws IOException {
		FileInputStream fileobj=new FileInputStream("ProjectGeneralData.properties");
		propertyobj=new Properties();
		propertyobj.load(fileobj);
		return propertyobj;

	}

	public void General() throws IOException {
		ExtentReport();
		logerfilereading();
		logobject.info("Property File Reading");
		Readingpropertyfile();
		String Seleniumdriver=propertyobj.getProperty("location");
		String testingurl=propertyobj.getProperty("url");
		logobject.info("Chromebrowser Launching");
		System.setProperty("webdriver.chrome.driver", Seleniumdriver);	
		driver=new ChromeDriver();
		logobject.info("Opening the URL");
		driver.get(testingurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@BeforeSuite
	public void GeneralActions()throws IOException {
		Readingpropertyfile();
		General();


	}

	@AfterSuite
	public void browserTermination()
	{
		logobject.info("Brwoser Termination");
		driver.quit();
		extentreporter.flush();
	}


}

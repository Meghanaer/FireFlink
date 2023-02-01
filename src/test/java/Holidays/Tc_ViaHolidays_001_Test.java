package Holidays;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_Libraries.BaseClass;
import pomRespository.HomePage;

public class Tc_ViaHolidays_001_Test  extends BaseClass {
	
	@Test
	public void holidays() {
	
	HomePage basepage=new HomePage(driver);
	
	basepage.getHolidaysNavBar().click();
	//BaseHomePage holidaysHomePage=new BaseHomePage(driver);
	Reporter.log("clicked",true);	
	}
}
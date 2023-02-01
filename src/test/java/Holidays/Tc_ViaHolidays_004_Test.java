package Holidays;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_Libraries.BaseClass;
import pomRespository.BaseHomePage;
import pomRespository.HomePage;

public class Tc_ViaHolidays_004_Test extends BaseClass{
	@Test
	public void toClickOnDrop() throws Exception {
		HomePage basepage=new HomePage(driver);
		BaseHomePage baseHomePage=new BaseHomePage(driver);
		basepage.getHolidaysNavBar().click();
		Reporter.log("clicked on holidays button",true);
		Thread.sleep(2000);
		baseHomePage.getDropdown().click();
		Reporter.log("clicked on dropdown", true);
	}

}

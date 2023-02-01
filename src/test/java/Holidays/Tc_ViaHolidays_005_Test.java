package Holidays;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_Libraries.BaseClass;
import pomRespository.BaseHomePage;
import pomRespository.HomePage;

public class Tc_ViaHolidays_005_Test extends BaseClass{
	@Test
	public void toClickOnPlusIcon() {
		HomePage basePage= new HomePage(driver);
		BaseHomePage baseHomePage=new BaseHomePage(driver);
		basePage.getHolidaysNavBar().click();
		Reporter.log("clicked on holidays module",true);
		baseHomePage.getDropdown().click();
		Reporter.log("clicked on rooms details dropdown",true);
		baseHomePage.getAdults_plusIcon().click();
		Reporter.log("clicked on plus icon to increment",true);
	}

}

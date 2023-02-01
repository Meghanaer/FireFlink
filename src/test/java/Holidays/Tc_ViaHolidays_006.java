package Holidays;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_Libraries.BaseClass;
import pomRespository.BaseHomePage;
import pomRespository.HomePage;

public class Tc_ViaHolidays_006 extends BaseClass{
	@Test
	public void ToclickOnMinus() {
		HomePage basePage=new HomePage(driver);
		BaseHomePage baseHomePage=new BaseHomePage(driver);
		basePage.getHolidaysNavBar().click();
		Reporter.log("clicked on holidays module",true);
		baseHomePage.getDropdown().click();
		Reporter.log("clicked on rooms details dropdown",true);
		baseHomePage.getAdults_minusIcon().click();
		Reporter.log("clicked on adults minus icon to decrement",true);
	}

}

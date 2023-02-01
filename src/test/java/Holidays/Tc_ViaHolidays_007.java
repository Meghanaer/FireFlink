package Holidays;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_Libraries.BaseClass;
import pomRespository.BaseHomePage;
import pomRespository.HomePage;

public class Tc_ViaHolidays_007 extends BaseClass {
	
	@Test
	public void ToverifyTheCountAfterClickOnPlusIcon() {
		HomePage homepage=new HomePage(driver);
		BaseHomePage basehomepage=new BaseHomePage(driver);
		homepage.getHolidaysNavBar().click();
		Reporter.log("clicked on holidays module",true);
		basehomepage.getDropdown().click();
		Reporter.log("clicked on rooms details dropdown",true);
		String count = basehomepage.getCount().getText();
		Reporter.log(count,true);
		basehomepage.getAdults_plusIcon().click();
		String text = basehomepage.getCount().getText();
		Reporter.log(text,true);
	}
	

}

package Holidays;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_Libraries.BaseClass;
import pomRespository.BaseHomePage;
import pomRespository.HomePage;

public class Tc_ViaHolidays_008 extends BaseClass{
	
	@Test
	public void ToClickOnAddRoom() {
		HomePage homepage=new HomePage(driver);
		BaseHomePage basehomepage=new BaseHomePage(driver);
		homepage.getHolidaysNavBar().click();
		basehomepage.getDropdown().click();
		basehomepage.getAddRoomIcon().click();
		Reporter.log("added second room details",true);
	}

}

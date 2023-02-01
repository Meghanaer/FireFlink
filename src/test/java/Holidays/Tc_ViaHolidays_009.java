package Holidays;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_Libraries.BaseClass;
import pomRespository.BaseHomePage;
import pomRespository.HomePage;

public class Tc_ViaHolidays_009 extends BaseClass{
	@Test
	public void ToClickOnDoneButton() {
		HomePage homepage=new HomePage(driver);
		BaseHomePage basehomepage=new BaseHomePage(driver);
		homepage.getHolidaysNavBar().click();
		basehomepage.getDropdown().click();
		basehomepage.getAdults_plusIcon().click();
		basehomepage.getDoneIcon().click();
		Reporter.log("clicked on donebutton",true);

}
}
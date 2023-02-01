package Holidays;

import org.testng.annotations.Test;

import generic_Libraries.BaseClass;
import generic_Libraries.ReadData;
import pomRespository.BaseHomePage;
import pomRespository.HomePage;

public class Tc_ViaHolidays_010 extends BaseClass {
	@Test
	public void ToClickOnSearchHolidays() {
		HomePage homepage=new HomePage(driver);
		BaseHomePage basehomepage=new BaseHomePage(driver);
		homepage.getHolidaysNavBar().click();
		String fromExcel = ReadData.fromExcel("Meghana", 1, 1);
		basehomepage.getDestinationTextBox().sendKeys(fromExcel);
		basehomepage.getMysoreSerachSuggestion().click();
		basehomepage.getSearchHolidays().click();

}
}
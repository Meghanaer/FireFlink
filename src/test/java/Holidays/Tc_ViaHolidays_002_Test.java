package Holidays;

import org.testng.annotations.Test;

import generic_Libraries.BaseClass;
import generic_Libraries.ReadData;
import pomRespository.BaseHomePage;
import pomRespository.HomePage;

public class Tc_ViaHolidays_002_Test extends BaseClass{
	
	@Test
	public void toEnterTheDestination() {
		HomePage basepage=new HomePage(driver);
		BaseHomePage basehomepage=new BaseHomePage(driver);
		basepage.getHolidaysNavBar().click();
		String fromExcel = ReadData.fromExcel("Meghana", 1, 1);
		basehomepage.getDestinationTextBox().sendKeys(fromExcel);
		basehomepage.getMysoreSerachSuggestion().click();
		
		
		
	}

}

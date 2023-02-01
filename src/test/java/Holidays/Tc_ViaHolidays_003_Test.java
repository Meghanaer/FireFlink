package Holidays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_Libraries.BaseClass;
import pomRespository.BaseHomePage;
import pomRespository.HomePage;

public class Tc_ViaHolidays_003_Test extends BaseClass {
	 	@Test
	public void toVerifyTheErrorMsg() throws InterruptedException {
	   
		HomePage basepage=new HomePage(driver);
		BaseHomePage basehomepage=new BaseHomePage(driver);
		basepage.getHolidaysNavBar().click();
		Thread.sleep(2000);
		basehomepage.getDestinationTextBox().sendKeys("Mysore");
		basehomepage.getSearchHolidays().click();
		WebElement toGetText = driver.findElement(By.xpath("//div[contains(text(),'Please enter')]"));
		String text=toGetText.getText();
		String expectedErrorMessage = basehomepage.getErrorMessage().getText();
		Assert.assertEquals(text,expectedErrorMessage, "text mismatched");
		
		
	}
	

}

package Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotationsTest{
	
	@BeforeSuite
	public void beforeSuit() {
		Reporter.log("before suit",true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("before test",true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("before class",true);
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("before Method",true);
	}
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("before method",true);
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("after method",true);
	}
	@AfterClass
	public void AfterClass() {
		Reporter.log("after class",true);
	}
	@Test
	public void testDataTest() {
		Reporter.log("hlo",true);
		
	}
	
	
}

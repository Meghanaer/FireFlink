package Annotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExampleTest {
	@DataProvider(name="Login")
	public Object[][] testData(){
		Object[][] data=new Object[2][2];
		data[0][0]="abcd";
		data[0][1]="abc";
		data[1][0]="asdvb";
		data[1][1]="asd";
		return data;
		
	}
	
	@Test(dataProvider="Login")
	public void loginTest(String UN, String pwd) {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
	//	driver.manage().window().maximize();
		System.out.println(UN);
		System.out.println(pwd);
		
		
	

}
}
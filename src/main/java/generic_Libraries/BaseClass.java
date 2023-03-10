package generic_Libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	public Actions action;
	public WebDriverWait explicitWait;

	@Parameters("browserName")
	@BeforeClass
	public void browserSetUp(@Optional("chrome") String bname) {
		//Step1:Launching a browser
		if (bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			Reporter.log("Empty Chrome Browser is launched Successfully", true);
		} else if (bname.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			Reporter.log("Empty Edge Browser is launched Successfully", true);
		} else {
			throw new InvalidBrowserValueException();
		}
		driver.manage().window().maximize();
		Reporter.log("Browser Window is maximized");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Step2:Navigating to the url
		driver.navigate().to(ReadData.fromPropertyFile("url").toString());
		action = new Actions(driver);
		action.click().perform();
		driver.findElement(By.xpath("//button[text()='No thanks!']")).click();
		String expectedTitle = driver.getTitle();
		//Assert.assertEquals(ReadData.fromPropertyFile("actualTitle"), expectedTitle,"Home Page Is not Displayed");

	}
	@AfterClass
	public void browserTermination() {
		driver.quit();
	}

}

class InvalidBrowserValueException extends RuntimeException {
	InvalidBrowserValueException() {
		super("Invalid Browser value is passed");
	}
}

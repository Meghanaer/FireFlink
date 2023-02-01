package pomRespository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaseHomePage {
	
	public BaseHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="destination")
	private WebElement destinationTextBox;
	
	@FindBy(linkText = "1 Room, 2 Guests")
	private WebElement roomsTextBox;
	
	@FindBy(xpath = "//i[contains(@class,'arrowDown')]")
	private WebElement dropdown;
	
	@FindBy(xpath="(//div[@class='minus'])[3]")
	private WebElement adults_minusIcon;
	
	@FindBy(xpath="(//div[text()='+'])[3]")
	private WebElement adults_plusIcon;
	
	@FindBy(xpath="//div[text()='-'])[4]")
	private WebElement child_minusIcon;
	
	@FindBy(xpath="(//div[text()='+'])[4]")
	private WebElement child_plusIcon;
	
	@FindBy(xpath = "//div[text()='Add Room']")
	private WebElement addRoomIcon;
	
	@FindBy(xpath = "//div[text()='Done']")
	private WebElement doneIcon;
	
	@FindBy(xpath="//div[@class='close']")
	private WebElement closeIcon;
	
	@FindBy(xpath = "//div[text()='Search Holidays']")
	private WebElement searchHolidays;
	
	@FindBy(xpath="//div[text()='Please enter a valid destination']")
	private WebElement errorMessage;
	
	@FindBy(xpath="(//div[@class='count'])[3]")
		private WebElement count;
	
	@FindBy(xpath="//span[ . ='Mysore, Karnataka, India']")
	private WebElement mysoreSerachSuggestion;

	public WebElement getMysoreSerachSuggestion() {
		return mysoreSerachSuggestion;
	}
	
	public WebElement getCount() {
		return count;
	}
	public WebElement getErrorMessage() {
		return errorMessage;
	}

	
	public WebElement getDestinationTextBox() {
		return destinationTextBox;
	}

	public WebElement getRoomsTextBox() {
		return roomsTextBox;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getAdults_minusIcon() {
		return adults_minusIcon;
	}

	public WebElement getAdults_plusIcon() {
		return adults_plusIcon;
	}

	public WebElement getChild_minusIcon() {
		return child_minusIcon;
	}

	public WebElement getChild_plusIcon() {
		return child_plusIcon;
	}

	public WebElement getAddRoomIcon() {
		return addRoomIcon;
	}

	public WebElement getDoneIcon() {
		return doneIcon;
	}

	public WebElement getCloseIcon() {
		return closeIcon;
	}

	public WebElement getSearchHolidays() {
		return searchHolidays;
	}

	
	
	
	
	
	
	
}

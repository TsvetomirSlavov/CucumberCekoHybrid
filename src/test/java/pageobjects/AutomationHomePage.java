package pageobjects;
import helpers.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationHomePage extends BaseClass{

	public AutomationHomePage(WebDriver driver){
		super(driver);
	}    

	
	@FindBy(how=How.LINK_TEXT, using="Sign in")
	public static WebElement sign_in;
	
	@FindBy(how=How.LINK_TEXT, using="Contact us")
	public static WebElement contact_us;
	
	@FindBy(how=How.LINK_TEXT, using="Sign out")
	public static WebElement sign_out;
		
	public static class HeaderPage 
	{

		// Dynamically generating elements not visible
		// Implement the hover over MoveToElement here, or even better implement it in AutomationHomePage and have it as
		// a public static method getter instead of a variable
		// otherwise the element is not visible
		// FindBy not applicable to local variable//
		// Use Waits for dynamic drop downs
		// Selenium 3 does not work good only 2.44.0
		public static WebElement getCasualDressesLinkInWomenSubMenu(){
			WebElement casual_dresses;
			WebElement women_link = driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[1]/a"));
			Actions builder = new Actions(driver);
			WebDriverWait wait = new WebDriverWait(driver, 10);

			builder.moveToElement(women_link).build().perform();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Casual Dresses")));
			casual_dresses = driver.findElement(By.linkText("Casual Dresses"));
			return casual_dresses;
		}
		
		@FindBy(how=How.LINK_TEXT, using="Women")
		public static WebElement menu_women;
		
		@FindBy(how=How.XPATH, using="//*a[@title='Dresses']")
		public static WebElement menu_dresses;
		
		@FindBy(how=How.XPATH, using="//*a[@title='T-shirts']")
		public static WebElement menu_tshirts;

		public static class WomenPage
		{
			@FindBy(how=How.LINK_TEXT,using="Dresses")
			public static WebElement dresses;

			public static class DressesPage
			{

				@FindBy(how=How.LINK_TEXT,using="Summer Dresses")
				public static WebElement summer_dresses;

			}
		}
		

		
	}
	
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
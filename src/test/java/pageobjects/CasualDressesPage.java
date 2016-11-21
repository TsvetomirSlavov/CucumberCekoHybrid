package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by ceko on 11/20/2016.
 */
public class CasualDressesPage extends BaseClass {

   public CasualDressesPage(WebDriver driver){
       super(driver);
   }

   @FindBy(how=How.XPATH, using = ".//*[@id='center_column']/div[1]/div/div/div/p[1]")
   public static WebElement every_day_text;

}

package modules;

/**
 * Created by ceko on 11/20/2016.
 */

import static org.testng.AssertJUnit.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import pageobjects.CasualDressesPage;
import pageobjects.OrderConfirmationPage;


public class CasualDressesTextAssertionAction {

    public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception {

        // Use Waits ExpectedCondition
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBePresentInElement(CasualDressesPage.every_day_text, "You are looking for a dress for every day? Take a look at"));
        assertEquals(CasualDressesPage.every_day_text.getText(), "You are looking for a dress for every day? Take a look at");

    }


}

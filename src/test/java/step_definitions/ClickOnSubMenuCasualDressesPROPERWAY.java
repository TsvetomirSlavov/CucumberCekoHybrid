package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import helpers.DataHelper;
import modules.CasualDressesTextAssertionAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pageobjects.AutomationHomePage;
import pageobjects.CasualDressesPage;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ceko on 11/20/2016.
 */
public class ClickOnSubMenuCasualDressesPROPERWAY {

    public WebDriver driver;
    public List<HashMap<String, String>> datamap;

    public ClickOnSubMenuCasualDressesPROPERWAY() {
        driver = Hooks.driver;
        datamap = DataHelper.data();
    }

    @And("^I click on Casual Dresses link$")
    public void i_click_on_Casual_Dresses_link() throws Throwable {
        // Implement the hover over MoveToElement here, or even better implement it in AutomationHomePage and have it as
        // a public static method getter instead of a variable
        // otherwise the element is not visible
        // Always init elements before using them with PageFactory is first and the all the actions are in a
        // separate method in a modules/actions class - this is Keyword driven instead of finding all the elements
        // before we perform actions on them we instantiate them with the PageFactory
        PageFactory.initElements(driver, AutomationHomePage.class);
        // This action must be implemented in a separate class in modules/action the next one is the proper way!
        AutomationHomePage.HeaderPage.getCasualDressesLinkInWomenSubMenu().click();
    }

    @Then("^I verify Casual Dresses page$")
    public void i_verify_Casual_Dresses_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        PageFactory.initElements(driver, CasualDressesPage.class);
        CasualDressesTextAssertionAction.Execute(driver, datamap);
    }

}

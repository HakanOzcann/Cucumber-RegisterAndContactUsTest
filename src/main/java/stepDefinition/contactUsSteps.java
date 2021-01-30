package stepDefinition;

import PageObjectModel.contactUsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.Assertion;
import utilities.Driver;
import java.util.concurrent.TimeUnit;

public class contactUsSteps
{

    private WebDriver driver;
    contactUsPage contactUsPage = new contactUsPage();

    @Given("^Navigate to Website$")
    public void navigate_to_Website() throws Throwable
    {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^Click on contact us button$")
    public void click_on_contact_us_button() throws Throwable
    {
        contactUsPage.clickContactUsButton();
    }

    @Given("^Select subject Heading$")
    public void select_subject_Heading() throws Throwable
    {
        contactUsPage.selectFromDropdown();
    }

    @Given("^Type Email$")
    public void type_Email() throws Throwable
    {
        contactUsPage.typeEmail();
    }

    @Given("^Type order reference$")
    public void type_order_reference() throws Throwable
    {
        contactUsPage.typeOrderReferance();
    }

    @Given("^Type a message$")
    public void type_a_message() throws Throwable
    {
        contactUsPage.typeMessage();
    }

    @When("^Click on send button$")
    public void click_on_send_button() throws Throwable
    {
        contactUsPage.clickOnSendButton();
    }

    @Then("^Verify success message$")
    public void verify_success_message() throws Throwable
    {
        contactUsPage.assertMyMessage();
    }

}

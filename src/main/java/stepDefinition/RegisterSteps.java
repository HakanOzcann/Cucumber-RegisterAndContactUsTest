package stepDefinition;

import PageObjectModel.registerPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class RegisterSteps
{
    registerPage registerPage = new registerPage();
    private WebDriver driver;

    @Given("^Navigate to website$")
    public void navigateToWebsite()
    {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("^Click  Sign in button$")
    public void clickSignInButton()
    {
        registerPage.clickOnSignInButton();
    }

    @And("^Type email \"([^\"]*)\"$")
    public void typeEmail(String email) throws Throwable
    {
        registerPage.typeEmail(email);
    }

    @And("^Click on Create an Account button$")
    public void clickOnCreateAnAccountButton()
    {
        registerPage.clickOnSubmitButton();
    }

    @And("^Choose title$")
    public void chooseTitle()
    {
    }

    @And("^Type firstname \"([^\"]*)\" and lastname \"([^\"]*)\"$")
    public void typeFirstnameAndLastname(String firstname, String lastname) throws Throwable
    {
        registerPage.typeFirstNameAndLastName(firstname,lastname);
    }

    @And("^Type password \"([^\"]*)\"$")
    public void typePassword(String password) throws Throwable
    {
        registerPage.typePasswrod(password);
    }

    @And("^Type company \"([^\"]*)\"$")
    public void typeCompany(String company) throws Throwable
    {
        registerPage.typeCompany(company);
    }

    @And("^Type address \"([^\"]*)\"$")
    public void typeAddress(String address) throws Throwable
    {
       registerPage.typeAddress(address);
    }

    @After
    public void quitDriver() throws InterruptedException
    {
        Thread.sleep(2000);
        Driver.closeDriver();
    }

}

package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utilities.Driver;

public class contactUsPage extends AbstractClass
{
    WebDriver driver;

    public contactUsPage()
    {
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@title='Contact Us']")
    private WebElement contactUsButton;

    public void clickContactUsButton()
    {
    clickFunction(contactUsButton);
    }

    @FindBy(name="id_contact")
    private WebElement subjectHeadingDropDown;

    public void selectFromDropdown()
    {
        selectElementFromDropdown(subjectHeadingDropDown,"Webmaster");
    }

    @FindBy(id="email")
    private WebElement emailTextArea;

    public void typeEmail()
    {
        sendKeysFunction(emailTextArea,"test@gmail.com");
    }

    @FindBy(name="id_order")
    private WebElement order;

    public void typeOrderReferance()
    {
        sendKeysFunction(order,"orderTest");
    }

    @FindBy(id="message")
    private WebElement messageBox;

    public void typeMessage()
    {
        sendKeysFunction(messageBox,"TESTMESSAGE TESTMESSAGE");
    }

    @FindBy(id="submitMessage")
    private WebElement sendButton;

    public void clickOnSendButton()
    {
        clickFunction(sendButton);
    }

    @FindBy(css = "p.alert-success")
    private WebElement successMessage;

    public void assertMyMessage()
    {
        Assertion(successMessage, "Your message has been successfully sent to our team.");
    }

}

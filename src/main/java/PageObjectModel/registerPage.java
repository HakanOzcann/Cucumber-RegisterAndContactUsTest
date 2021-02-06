package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class registerPage extends AbstractClass {

    private WebDriver driver;

    public registerPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a.login")
    private WebElement SigInButton;

    public void clickOnSignInButton()
    {
        clickFunction(SigInButton);
    }

    @FindBy(name = "email_create")
    private WebElement emailTextBox;

    public void typeEmail(String email)
    {
        sendKeysFunction(emailTextBox, email);
    }

    @FindBy(id = "SubmitCreate")
    private WebElement submitButton;

    public void clickOnSubmitButton()
    {
        clickFunction(submitButton);
    }

    @FindBy(id= "id_gender1")
    private WebElement gender;

    public void clickOnGenderButton()
    {
        clickFunction(gender);
    }

    @FindBy(id= "customer_firstname")
    private WebElement firstname;

    @FindBy(id= "customer_lastname")
    private WebElement lastname;

    public void typeFirstNameAndLastName(String firstName, String lastName)
    {
        sendKeysFunction(firstname,firstName);
        sendKeysFunction(lastname, lastName);
    }

    @FindBy(name= "passwd")
    private WebElement password;

    public void typePasswrod(String Password)
    {
        sendKeysFunction(password, Password);
    }

    @FindBy(id = "company")
    private WebElement company;

    public void typeCompany(String Company)
    {
        sendKeysFunction(company, Company);
    }

    @FindBy(name = "address1")
    private WebElement address;

    public void typeAddress(String Address)
    {
        sendKeysFunction(address, Address);
    }



}








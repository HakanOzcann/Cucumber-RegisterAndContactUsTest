package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class contactUsPage extends AbstractClass {
    WebDriver driver;

    public contactUsPage()
    {
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
@FindBy(xpath = "//a[@title='Contact Us']")
    private WebElement contactUsButton;

    public void clickContactUsButton(){
    clickFunction(contactUsButton);
    }

}

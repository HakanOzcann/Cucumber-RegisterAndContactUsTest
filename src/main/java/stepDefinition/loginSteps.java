package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginSteps {
    @Given("^Amazon sitesine git$")
    public void amazon_sitesine_git() throws Throwable {
        System.out.println("deneme1");
    }

    @Given("^login butonuna tıkla$")
    public void login_butonuna_tıkla() throws Throwable {
        System.out.println("deneme2");
    }

    @Given("^ID gir$")
    public void ıd_gir() throws Throwable {
        System.out.println("deneme3");
    }

    @Given("^Password gir$")
    public void password_gir() throws Throwable {
        System.out.println("deneme4");
    }

    @When("^submit butonuna tıklandıgında$")
    public void submit_butonuna_tıklandıgında() throws Throwable {
        System.out.println("deneme5");
    }

    @Then("^success mesajini verify et$")
    public void success_mesajini_verify_et() throws Throwable {
        System.out.println("deneme6");
    }
}

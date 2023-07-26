package TestStep.Admin;

import BaseClass.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AdminLoginStep extends BaseStep {

    @Given("Admin account is created")
    public void adminAccountIsCreated() {
    }

    @When("I input username {string}")
    public void iInputUsername(String x) {
        adminLogin.setLoginUsername(x);
    }

    @And("I input password {string}")
    public void iInputPassword(String x) {
        adminLogin.setLoginPassword(x);
    }

    @And("I click masuk")
    public void iClickMasuk() {
        adminLogin.setMasuk();
    }

    @And("I close ads pop up")
    public void iCloseAdsPopUp() {
        adminLogin.setCloseAdsPopUp();
    }

    @Then("Success to login as admin")
    public void successToLoginAsAdmin() {
        adminLogin.setHomePage();
    }

}

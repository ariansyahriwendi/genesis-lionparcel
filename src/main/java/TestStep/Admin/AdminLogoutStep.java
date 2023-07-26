package TestStep.Admin;

import BaseClass.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminLogoutStep extends BaseStep {

    @Given("Admin signed in")
    public void adminSignedIn() {
        adminLogin.setLoginUsername("pos.testing.enno");
        adminLogin.setLoginPassword("Genesis000");
        adminLogin.setMasuk();
        adminLogin.setCloseAdsPopUp();
        adminLogin.setHomePage();
    }

    @When("I click keluar")
    public void iClickKeluar() {
        adminLogout.setKeluar();
    }

    @And("I click ya")
    public void iClickYa() {
        adminLogout.setKeluarYa();
    }

    @Then("Success to logout")
    public void successToLogout() {
        adminLogout.setLoginPage();
    }
}

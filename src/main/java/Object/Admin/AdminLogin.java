package Object.Admin;

import BaseClass.BaseSetUp;
import org.openqa.selenium.By;

public class AdminLogin extends BaseSetUp {

    private final By loginUsername = new By.ById("email");
    public void setLoginUsername(String x) {
        inputText(loginUsername, x);
    }

    private final By loginPassword = new By.ByXPath("//*[@id=\"app\"]/div/div/form/div[4]/input");
    public void setLoginPassword(String x) {
        inputText(loginPassword, x);
    }

    private final By masuk = new By.ById("login");
    public void setMasuk() {
        clickButton(masuk);
    }

    private final By closeAdsPopUp = new By.ByXPath("//*[@id=\"app\"]/div[2]/div[1]/div[1]");
    public void setCloseAdsPopUp() {
        clickButton(closeAdsPopUp);
    }

    private final By homePage = new By.ByXPath("//*[@id=\"app\"]/div/div[2]/div[1]/div");
    public void setHomePage() {
        isDisplayed(homePage);
    }

}

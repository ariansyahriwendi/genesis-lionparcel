package Object.Admin;

import BaseClass.BaseSetUp;
import org.openqa.selenium.By;

public class AdminLogout extends BaseSetUp {

    private final By keluar = new By.ByXPath("//*[@id=\"app\"]/div/div[2]/div[4]/ul/li[2]");
    public void setKeluar() {
        clickButton(keluar);
    }

    private final By keluarYa = new By.ByXPath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div/div[3]/div[1]/button");
    public void setKeluarYa() {
        clickButton(keluarYa);
    }

    private final By loginPage = new By.ByXPath("//*[@id=\"app\"]/div/div/img");
    public void setLoginPage() {
        isDisplayed(loginPage);
    }

}

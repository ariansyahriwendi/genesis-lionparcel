package Object.Admin;

import BaseClass.BaseSetUp;
import org.openqa.selenium.By;

public class AdminCekTarif extends BaseSetUp {

    private final By tarif = new By.ById("main-menu-6");
    public void setTarif() {
        clickButton(tarif);
    }

    private final By cekTarif = new By.ByXPath("//*[@id=\"menu-6\"]/div[2]");
    public void setCekTarif() {
        clickButton(cekTarif);
    }

    private final By inputAlamatAsal = new By.ByXPath("//*[@id=\"app\"]/div/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input");
    public void setInputAlamatAsal(String x) {
        inputText(inputAlamatAsal, x);
    }

    private final By inputAlamatAsalJakarta = new By.ByXPath("//*[@id=\"app\"]/div/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul/li[1]");
    public void setInputAlamatAsalJakarta() {
        clickButton(inputAlamatAsalJakarta);
    }

    private final By inputAlamatTujuan = new By.ByXPath("//*[@id=\"app\"]/div/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/input");
    public void setInputAlamatTujuan(String x) {
        inputText(inputAlamatTujuan, x);
    }

    private final By inputAlamatTujuanTangerang = new By.ByXPath("//*[@id=\"app\"]/div/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul/li[1]");
    public void setInputAlamatTujuanTangerang() {
        clickButton(inputAlamatTujuanTangerang);
    }

    private final By hargaBarang = new By.ByXPath("//*[@id=\"app\"]/div/div[4]/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[2]/input");
    public void setHargaBarang() {
        clickButton(hargaBarang);
    }

    private final By inputHargaBarang = new By.ByXPath("//*[@id=\"app\"]/div/div[4]/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[2]/input");
    public void setInputHargaBarang(String x) {
        inputText(inputHargaBarang, x);
    }

    private final By submitCekTarif = new By.ByXPath("//*[@id=\"app\"]/div/div[4]/div[2]/div[2]/div[1]/div[2]/div[5]/button");
    public void setSubmitCekTarif() {
        clickButton(submitCekTarif);
    }

}

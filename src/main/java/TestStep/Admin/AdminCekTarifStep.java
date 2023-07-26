package TestStep.Admin;

import BaseClass.BaseSetUp;
import BaseClass.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminCekTarifStep extends BaseStep{

    @When("I click tarif")
    public void IClickTarif() {
        adminCekTarif.setTarif();
    }

    @And("I click cek tarif")
    public void iClickCekTarif() {
        adminCekTarif.setCekTarif();
    }

    @And("I input alamat asal {string}")
    public void iInputAlamatAsal(String x) throws InterruptedException {
        adminCekTarif.setInputAlamatAsal(x);
        Thread.sleep(1000);
        adminCekTarif.setInputAlamatAsalJakarta();
    }

    @And("I input alamat tujuan {string}")
    public void iInputAlamatTujuan(String x) throws InterruptedException {
        adminCekTarif.setInputAlamatTujuan(x);
        Thread.sleep(1000);
        adminCekTarif.setInputAlamatTujuanTangerang();
    }

    @And("I select produk pengiriman")
    public void iSelectProdukPengiriman() {
    }

    @And("I input jenis komoditas")
    public void iInputJenisKomoditas() {
    }

    @And("I input berat")
    public void iInputBerat() {
    }

    @And("I input dimensi panjang")
    public void iInputDimensiPanjang() {
    }

    @And("I input dimensi lebar")
    public void iInputDimensiLebar() {
    }

    @And("I input dimensi tinggi")
    public void iInputDimensiTinggi() {
    }

    @And("I input harga barang {string}")
    public void iInputHargaBarang(String x) {
        adminCekTarif.setInputHargaBarang(x);
    }

    @And("I click submit cek tarif")
    public void iClickSubmitCekTarif() {
        adminCekTarif.setSubmitCekTarif();
    }

    @Then("Success to cek tarif")
    public void successToCekTarif() {
    }
}

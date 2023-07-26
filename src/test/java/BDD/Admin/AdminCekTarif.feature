@AdminCekTarif
Feature: Admin Cek Tarif
  As an admin
  I want to access cek tarif
  So that I can access that feature

  @AdminSuccessToCekTarif
  Scenario: Admin Success To Cek Tarif
    Given Admin signed in
    When I click tarif
    And I click cek tarif
    And I input alamat asal "JAKARTA"
    And I input alamat tujuan "TANGERANG"
    And I select produk pengiriman
    And I input jenis komoditas
    And I input berat
    And I input dimensi panjang
    And I input dimensi lebar
    And I input dimensi tinggi
    And I input harga barang "10000"
    And I click submit cek tarif
    Then Success to cek tarif
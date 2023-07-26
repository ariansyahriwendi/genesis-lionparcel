@AdminLogin
Feature: Admin Login
  As an admin
  I want to login
  So that I can access my account

  @AdminSuccessToLogin
  Scenario: Admin Success To Login
    Given Admin account is created
    When I input username "pos.testing.enno"
    And I input password "Genesis000"
    And I click masuk
    And I close ads pop up
    Then Success to login as admin
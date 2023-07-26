@AdminLogout
Feature: Admin Logout
  As an admin
  I want to logout
  So that I can access my account

  @AdminSuccessToLogout
  Scenario: Admin Success To Logout
    Given Admin signed in
    When I click keluar
    And I click ya
    Then Success to logout
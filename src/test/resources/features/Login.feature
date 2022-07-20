Feature: Login page

  Background:
    Given user is on login page

    @login
    Scenario: Verify user can login to System with valid credentials
      When user types "jwk31" in username field
      And user types "Samsung103110" in password field
      And user clicks on Login button
      Then user should successfully land to Home page
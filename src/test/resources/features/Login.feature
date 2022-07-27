Feature: Login page

  Background:
    Given user is on login page

    @smoke
    Scenario: Verify user can login to System with valid credentials
      When user types "" in username field
      And user types "" in password field
      And user clicks on Login button
      Then user should successfully land to Home page
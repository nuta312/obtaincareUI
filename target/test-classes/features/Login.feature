Feature: Login page
  Background:
    Given user is on login page

  @login
    Scenario: Verify user can login to System with valid credentials
      When user type "dd" in user name input field
      And user type "TpZD4&8#btHk&Wx" in password input field
      And user click on Login button
      Then user should successfully land to Home page
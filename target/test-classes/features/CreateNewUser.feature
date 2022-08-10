@smoke
Feature: Create new User as Admin

  Background: Sign in As Admin
    Given user is on Home page


  Scenario: Create new User as Admin positive
    Given click on add new User button
    And create new user with following data
#      | firstName | lastName | emailAddress   | userName | password | bio   |
      | Elon      | Musk     | elon@gmail.com | elon     | El@n123!!@@  |
    And click Add new user button
    Then User successfully created with the following data
    |Elon|Musk|elon@gmail.com|elon |



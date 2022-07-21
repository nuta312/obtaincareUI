Feature: Add new user


  Background: login to the system
    Given login with following credentials as admin:
#      | userName | password      |
      | jwk31 | Samsung103110 |

  @addUser
  Scenario: Add new user
    When admin clicks on Add user button
    Then admin should see Add user page
    When admin fills input fields with following new user info:
      | Asan | Daniyarov | asan12@gmail.com | asan | Aa12345! | Some text | Learner-Type | (GMT +06:00) Almaty | English |
    And admin clicks on Add user button
    Then user should see confirmation alert with text "Success! Do you want to add another user?"
    When admin chooses all courses
    And admin clicks Users button on header
    Then admin should see information of new user (with email "asan@gmail.com")


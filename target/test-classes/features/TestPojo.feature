Feature: Test POJO

  Background: Sign in As Admin
    Given user is on Home page

  @smoke
  Scenario: Create new User as Admin positive
    Given click on add new User button
    And create new user with following dataa
      | firstName | lastName | emailAddress     | userName | password      |
      | Elon12    | Musk12   | elon12@gmail.com | elon12   | El@n123!!@@   |
      | Leo       | Messi    | messi@gmail.com  | messi    | Messi2123!!@@ |
    And click Add new user button
    Then User successfully created with the following dataaa
      | firstName | lastName | emailAddress     | userName | password    |
      | Elon12    | Musk12   | elon12@gmail.com | elon12   | El@n123!!@@ |


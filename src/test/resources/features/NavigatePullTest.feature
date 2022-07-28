Feature: Home page Navigate Pull Test

  Background: Admin log in system
    Given on web talent
    Given login with following credentials as admin:
      | aidar3107 | Aidar548889 |

  @Regression
  Scenario: Testing all header's elements
    Given admin on home page
    And admin should see "A. Aidar Administrator" header
    Then admin open two new tab, where appears home page with Instructor and Learner roles
    And admin switch to second tab and should see "A. Aidar Instructor" text on header and close this tab
    Then admin switch to third tab and should see "A. Aidar Learner" texts on header and new green points button and close this tab
    When admin switch to parent window admin move to Go to drop down menu
    Then admin should see all elements on this drop down menu
    And admin open all elements on drop down menu in new tab
    Then admin switch to opened tabs and should see new tab





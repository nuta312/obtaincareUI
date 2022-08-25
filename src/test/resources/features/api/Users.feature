Feature: Users functionality


  @apiUser
  Scenario: Get all users
    Given all users are requested
    Then status code is 200 is returned
    And 1 user is returned
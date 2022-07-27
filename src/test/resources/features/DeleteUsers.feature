Feature: Delete All Users

  Background: Admin login in system
    Given on web talent
    Given login with following credentials as admin:
      | aidar3107 | aidar548889  |

    @DeleteUsers
    Scenario: Admin delete all users
      Given admin clicked on TalentlmsHome button
      And admin clicked Users button
      Then admin should see information of new user
      And admin delete all user's userInfo
      Then admin should see only SuperAdmin user
Feature: Add new user

  Background: login to the system
    Given on web talent
    Given login with following credentials as admin:
#      | userName  | password    |
      | aidar3107 | Aidar548889 |

  @Smoke
  Scenario: Add new user
    Then admin clicked on TalentlmsHome button
    When admin clicks on Add user button
    Then admin should see "Home / Users / Add user" page
    When admin fills input fields with following new user info:
#      | firstName | lastName | email             | userName | password    | bio      | userType     | timeZone            | language |
      | Aidar  | Askeev    | askeev711217111BTC@gmail.com | aidar1711111E2LONMUSK  | Bitcoin.1000 | BTC dump | Learner-Type | (GMT +06:00) Almaty | English |
      | Nikita | Cherevko  | chervnik1111112ETH@gmail.com | nikito111s11217BITCOIN | Ether.2000   | ETH PUMP | Learner-Type | (GMT +06:00) Almaty | English |
      | Asan   | Daniyarov | asa1nXRP111112@gmail.com     | asan7DO11112111GE       | asanDoge.100 | ETH PUMP | Learner-Type | (GMT +06:00) Almaty | English |
#    Then user should see confirmation alert with text "Success! Do you want to add another user?"
#    And admin clicked info button
#    Then admin should see created user's userInfo
#    And admin clicked courses button
#    When admin chooses all courses
    And admin clicks Users button on header
    Then admin should see information of new user
    And admin after create users must to delete all created Users


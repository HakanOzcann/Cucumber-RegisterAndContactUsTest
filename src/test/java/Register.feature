Feature: Register Test

  Scenario Outline: Create An Account

    Given Navigate to website
    And Click  Sign in button
    And Type email "<Email>"
    And Click on Create an Account button
    And Choose title
    And Type firstname "<firstname>" and lastname "<lastname>"
    And Type password "<password>"
    And Type company "<company>"
    And Type address "<address>"
    Examples:
      | Email | firstname | lastname | password | company | address |

      |testhakan@gmail.com |Hakan |Özcan |123test |testCompany |testAddress|
      |test123@gmail.com |Samet |Kaya |123test1 |testCompany1 |testAddress1|
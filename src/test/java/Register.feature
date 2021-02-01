Feature: Register Test

  Scenario Outline: Create An Account

    Given Navigate to Website
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

      |testHakan@gmail.com |Hakan |Ozcan |123test |testCompany |testAddress|
      |test1234@gmail.com |TestName |TestSurname |123test1 |testCompany1 |testAddress1|
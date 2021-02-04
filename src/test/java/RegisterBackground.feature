Feature: Register Test
  
  Background: 
    Given Navigate to Website
    And Click  Sign in button
    And Type email "test1234@hotmail.com"
    And Click on Create an Account button
    
      Scenario: Person1
        And Type firstname "testName" and lastname "testSurname"
        And Type password "123test123"

      Scenario: Person2
        And Type company "typeCompany"
        And Type address "testAddress"

        Scenario Outline: Person3

          And Type firstname "<isim>" and lastname "<soyisim>"
          And Type password "<sifre>"
          And Type company "<sirket>"
          And Type address "<adres>"
          Examples:
            | isim | soyisim | sifre | sirket | adres |
            |testOzcan@gmail.com | testName | testSurname |testCompany |testAddress|

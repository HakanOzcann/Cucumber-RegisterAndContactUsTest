Feature: Contact Us Test

  Scenario: Go to website and test Contact us Page

    Given Navigate to Website
    And Click on contact us button
    And Select subject Heading
    And Type Email
    And Type order reference
    And Type a message
    When Click on send button
    Then Verify success message

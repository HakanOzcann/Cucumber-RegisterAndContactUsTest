Feature: Login Test
  Scenario: Go to amazon website and test login page

    Given Amazon sitesine git
    And login butonuna tıkla
    And ID gir
    And Password gir
    When submit butonuna tıklandıgında
    Then success mesajini verify et

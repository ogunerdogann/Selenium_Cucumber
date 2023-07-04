Feature: Amazonda Coklu Arama

  Scenario Outline: TC13 Kullanici Amazonda coklu arama yapabilmeli

    Given Kullanici "amazonUrl" ana sayfaya gider
    When "<aranacakUrun>" icin arama yapar
    Then Arama sonuclarinin "<aranacakUrun>" icerdigini test eder
    And 3 saniye bekler
    And Sayfayi kapatir


    Examples:
      | aranacakUrun |
      | Java |
      | Phyton |
      | Cucumber |
      | Apple |
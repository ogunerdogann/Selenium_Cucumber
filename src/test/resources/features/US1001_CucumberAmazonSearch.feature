Feature: 1001_Cucumber Amazon Search Test

  Scenario: TC01 Amazon Nutella Testi
    Given Kullanici Amazon ana sayfaya gider
    When Nutella icin arama yapar
    Then Arama sonuclarinin Nutella icerdigini test eder
    And Sayfayi kapatir

  Scenario: TC02 Amazon Java Testi
    Given Kullanici Amazon ana sayfaya gider
    When Java icin arama yapar
    Then Arama sonuclarinin Java icerdigini test eder
    And Sayfayi kapatir

  Scenario: TC03 Amazon Samsung Testi
    Given Kullanici Amazon ana sayfaya gider
    When Samsung icin arama yapar
    Then Arama sonuclarinin Samsung icerdigini test eder
    And Sayfayi kapatir
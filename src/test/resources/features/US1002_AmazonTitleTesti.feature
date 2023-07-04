Feature: US1002 Amazon Title Testi

  @smoke @regression
  Scenario: TC04 Kullanici amazon sayfasinin title'inin dogru oldugunu kontrol eder

    Given Kullanici Amazon ana sayfaya gider
    Then title'in amazon icerdigini test eder
    And Sayfayi kapatir
Feature: US1004 Steplerde parametre kullanilabilmeli

  Scenario: TC08 Amazon Nutella Testi
    Given Kullanici "amazonUrl" ana sayfaya gider
    When "Nutella" icin arama yapar
    Then Arama sonuclarinin "Nutella" icerdigini test eder
    # ctrl'ye basip ilgili methodun üzerine gelip tikladiginda o methodun kod kismina otomatik götürür.
    And 3 saniye bekler
    And Sayfayi kapatir


  @smoke @ss
  Scenario: TC09 Amazon Java Testi
    Given Kullanici "amazonUrl" ana sayfaya gider
    When "Java" icin arama yapar
    Then Arama sonuclarinin "Java" icerdigini test eder
    And 3 saniye bekler
    And Sayfayi kapatir

  Scenario: TC10 Amazon Samsung Testi
    Given Kullanici "amazonUrl" ana sayfaya gider
    When "Samsung" icin arama yapar
    Then Arama sonuclarinin "Samsung" icerdigini test eder
    And 3 saniye bekler
    And Sayfayi kapatir
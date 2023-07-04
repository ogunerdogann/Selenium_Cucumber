Feature: US1006 Amazonda aranan urun dogrulamasi

  @wip
  Scenario: TC12 Aranan ürünün dogru oldugu test edilebilmeli

    Given Kullanici "amazonUrl" ana sayfaya gider
    Then "Nutella" icin arama yapar
    And ilk ürüne click yapar
    And acilan ürün isminin "Nutella" icerdigini test eder
    And Sayfayi kapatir
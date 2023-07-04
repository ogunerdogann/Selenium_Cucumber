
Feature: US1005 Kullanici butonlari test eder

  Scenario: TC11 Kullanici butonlari ve cikan yazilari test eder


    Given Kullanici "herokuUrl" ana sayfaya gider
    Then Add Element butonuna basar
    And Delete butonu görünür oluncaya kadar bekler
    And Delete butonunun görünür oldugunu test eder
    Then Delete butonuna basarak butonu siler
    And Delete butonunun görünmedigini test eder
    And Sayfayi kapatir

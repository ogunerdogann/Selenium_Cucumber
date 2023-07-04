Feature: US1008 Toplu kullanici listesi ile negatif login testi

  @qd
 Scenario Outline: TC14 Kullanici listedeki kullanici bilgileri ile giris yapilamadigini test eder

   Given Kullanici "qdUrl" ana sayfaya gider
   Then ilk login linkine click yapar
   And user email olarak "<email>" girer
   And password olarak "<password>" girer
   When login butonuna basar
   Then giris yapilamadigini test eder
    And Sayfayi kapatir
   Examples:
     | email         | password |
     |abc@gmail.com  | 12345    |
     |abde@gmail.com | 1234559  |
     |abcd@gmail.com | 123456   |
     |abck@gmail.com | 1234567  |
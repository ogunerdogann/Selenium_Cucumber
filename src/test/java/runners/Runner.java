package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@regression and @smoke",

        dryRun=false
)
public class Runner {

    /*
    Cucumber'da runner class'i istedigimiz testleri calistirmak ve her calistirilan
    test icin rapor hazirlamak icin kullanilir.

    Runner Class'i bos bir class'tir

    Belirtilen bu islevi class icerisindeki kodlar degil, class deklarasyonunda kullanacagimiz
    Notasyonlar halleder.

    @RunWith notasyonu Framework'ümüze JUnit yüklememizin sebebidir
        ve Runner Class'inin Cucumber ile calismasini saglar.

    @CucumberOptions ise framework'ümüzde gerekli ayarlamalari yapar

    features : feature dosyalarimizin bulundugu konumu gösterir
               dikkat edilirse tek tek feature dosyalarini degil
               tüm feature dosyalarini iceren klasörün yolunu yaziyoruz

    glue : feature dosyalari ile bagli olan Java method'larinin yerini gösterir
           Burada da tek tek class'lari degil, tüm class'lari
           iceren package'in adresini yazariz.
           Böylece ilgili step hangi class altinda olursa olsun cucumber bulup calistirir

    tags : calistirilacak feature veya scenario'lari isaretlemek icin kullanilir
           cucumber Runner Class'i calistirildiginda
           tüm feature dosyalarini gözden gecirir ve Runner class'inda belirtilen
           tag'a sahip TÜM feature ve Scenario(lari) calistirir

           Eger birden fazla tag'i kontrol ederek calistirmasini istersek
           "@regression and @smoke" veya "@regression or @smoke" seklinde yazim kullanilir.

        dryRun : Bir feature dosyasini ilk defa yazdigimizda
        step'lerden bazilari daha önce var oldugundan BEYAZ
        bazilari ise ilk defa kullanacagimiz icin SARI olur.

        Bu Feature dosyasini direk calistirmak istersek
        bastan baslayarak beyaz olan adimlari calistirir.
        Ilk sari adima geldiginde, exception firlatip calistirmayi denedigi
        ilk sari satir ve geriye kalan sari satirlarin
        eksik steplerini bize yazdirir.

        Amacimiz Feature dosyasini calistirmak degil, sadece eksik step'lere ait kodlari olusturmak ise
        Runner class'inda dryRun = true yazip
        Runner class'ini calistiririz.

        dryRun = true dedigimizde
        Cucumber testleri calistirmaz, sadece eksik adim var mi diye kontrol eder
        eksik adim yoksa Test PASSED yazar.

        dryRun = false default degerdir ve testleri normal olarak calistirmamizi saglar
     */
}

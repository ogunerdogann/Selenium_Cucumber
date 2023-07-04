package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.HerokuPage;

public class HerokuAppStepDefinitions {

    HerokuPage herokuPage = new HerokuPage();

    @Then("Add Element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuPage.addElementButonu.click();
    }

    @Then("Delete butonu görünür oluncaya kadar bekler")
    public void delete_butonu_görünür_oluncaya_kadar_bekler() {
        //Delete butonu implicitly wait süresi icinde görünür oldugundan
        //bu adimda bir islem yapilmadi!
    }

    @Then("Delete butonunun görünür oldugunu test eder")
    public void delete_butonunun_görünür_oldugunu_test_eder() {
        Assert.assertTrue(herokuPage.deleteButonu.isDisplayed());
    }

    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokuPage.deleteButonu.click();
    }

    @Then("Delete butonunun görünmedigini test eder")
    public void delete_butonunun_görünmedigini_test_eder() {
        //olmayan bir elementi test yapmaya calisiyoruz
        //Kod calistiginda böyle bir element bulunamayacagindan NoSuchElementException firlatir
        //Bizim aradigimiz da bu zaten
        // o nedenle try-catch kombinasyonu kullaniyoruz
        try {
            Assert.assertTrue(herokuPage.deleteButonu.isDisplayed());
        } catch (NoSuchElementException e) {

            Assert.assertTrue(true); //adim buraya gelmisse passed olmustur!
        }
    }

}

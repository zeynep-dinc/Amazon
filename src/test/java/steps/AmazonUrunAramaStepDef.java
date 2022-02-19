package steps;

import amazon.Amazon;
import io.cucumber.java.en.Given;

public class AmazonUrunAramaStepDef {

    Amazon amazon=new Amazon();

    @Given("sayfa basliginin içinde {string} oldugunu dogrula")
    public void sayfa_basliginin_içinde_oldugunu_dogrula(String driverTitle) {
        amazon.sayfaBasligininIceriginiKontrolEt(driverTitle);
        amazon.screenShot();
    }

    @Given("cerezler alaninin acilip acilmadigini kontrol et")
    public void cerezler_alaninin_acilip_acilmadigini_kontrol_et() {
        amazon.cerezAyarlariKontrol();
    }
    @Given("{string} urununu arat")
    public void urununu_arat(String urunAdi) {
        amazon.urunAra(urunAdi);
    }

    @Given("ilk urunu sec")
    public void ilk_urunu_sec() {
        amazon.ilkUrunuSec();
    }


    @Given("urunun bilgilerini yazdir")
    public void urunun_bilgilerini_yazdir() {
        amazon.screenShot();
        amazon.urunBilgileriniYaz();
    }
}

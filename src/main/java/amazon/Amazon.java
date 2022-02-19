package amazon;

import base.BaseEventClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Amazon extends BaseEventClass {

    public Amazon(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='sp-cc-accept']")
    private WebElement acceptToCookiesElement;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBoxTextBox;

    @FindBy(xpath = "(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]")
    private WebElement firstElementOfList;

    @FindBy(xpath = "(//span[@class='selection'])[1]")
    private WebElement sizeTextElement;

    @FindBy(xpath = "(//span[@class='selection'])[2]")
    private WebElement colorTextElement;

    @FindBy(xpath = "(//span[@class='a-size-medium a-color-success'])")
    private WebElement stockStatueTextElement;

    @FindBy(className = "a-price-whole")
    private WebElement lirasTextElement;

    @FindBy(className = "a-price-fraction")
    private WebElement kurusTextElement;


    public void sayfaBasligininIceriginiKontrolEt(String beklenenBaslik){
        Assert.assertTrue(driver.getTitle().contains(beklenenBaslik));
    }

    public void cerezAyarlariKontrol(){
       elementToBeClickable(acceptToCookiesElement);
    }

    public void urunAra(String urunAdi){
        elementToBeClickable(searchBoxTextBox);
        sendKeysFunction(searchBoxTextBox,urunAdi);
        sendKeysWithActionMethod(Keys.ENTER);
    }

    public void ilkUrunuSec(){
        elementToBeClickable(firstElementOfList);
    }

    public void writeToFile(String info){
        BufferedWriter file=null;
        try {
            file = new BufferedWriter(new FileWriter(System.getProperty("user.dir")+"/urun_bilgileri.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            file.write(info);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void urunBilgileriniYaz(){
        String info="########\t\tBilgiler\t\t########"+
                "\nFiyat:\t"+lirasTextElement.getText()+" lira "+kurusTextElement.getText()+" kuruş"+
                "\nRenk:\t"+colorTextElement.getText()+
                "\nBellek:\t"+sizeTextElement.getText()+
                "\nStok:\t"+stockStatueTextElement.getText();
        System.out.println(info);
        writeToFile(info);
        System.out.println("\n***\tBilgiler 'urun_bilgileri.txt' dosyasına yazıldı. Teyit edilebilir.\t***");
    }
}

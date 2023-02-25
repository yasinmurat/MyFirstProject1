package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Conditions;

import java.time.Duration;

import static locators.Locators.*;

public class Scenarios1 extends BaseTest {


    //TODO kodlarinizi buraya yaziniz

    /*
        BaseTest classini extend etmeli,
        BaseTest icindeki fields (variables) ve attribute'lar (methodlar) kullanilmali
        constructorunda driver ve wait tanimlanmali
        scenariolar asagidaki methodlar icine yazilmali
     */



    @Test
    public void Scenario2Opencart(){

        driver=getDriver();
        wait=new WebDriverWait(driver,Duration.ofSeconds(15));
        driver.manage().window().maximize();
       /* Scenario-2



        4.  Register formun tüm alanlari doldurun ve "Continue" butonuna tiklayin
        Bilgiler Fake olabilir.
        5.  Account'un create edildigini dogrulayin.
        6.  MyAccount linkinden Login'e tiklayin
        7.  Login bilgilerini girin ve login olun
        8.  login oldugunuzu dogrulayin
        9.  MyAccount linkinden logout olun
        10. Loout oldugunuzu onaylayin*/

        //1.  http://opencart.abstracta.us/ sayfasina gidin
        String url="http://opencart.abstracta.us";
        open(url);
        //2.  Menüde MyAccout'a tiklayin
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        //3.  Popup'in acilmasini bekleyin ve Register'a tiklayin
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        //4.  Register formun tüm alanlari doldurun ve "Continue" butonuna tiklayin
        //Bilgiler Fake olabilir.
        sendkeys(firstName2,"Yasin Murat");
        sendkeys(lastName2,"YENI");
        sendkeys(emailBox,"murat@gmail");
        sendkeys(telBox,"5454345456");
        sendkeys(password,"12345");
        sendkeys(passwordConfirmBox,"12345");
        click(agreeBox);
        click(continueButton2);

    }

    @Test
    public void Scenario3Demoqa(){

    }

}

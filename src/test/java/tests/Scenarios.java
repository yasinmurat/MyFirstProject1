package tests;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Conditions;

import java.time.Duration;

import static locators.Locators.*;

public class Scenarios extends BaseTest {


    //TODO kodlarinizi buraya yaziniz

    /*
        BaseTest classini extend etmeli,
        BaseTest icindeki fields (variables) ve attribute'lar (methodlar) kullanilmali
        constructorunda driver ve wait tanimlanmali
        scenariolar asagidaki methodlar icine yazilmali
     */


    @Test
    public void Scenario1Saucedemo(){
       // Sceanrio-1
        driver=getDriver();
        wait=new  WebDriverWait(driver,Duration.ofSeconds(15));
        driver.manage().window().maximize();
        //1.  https://www.saucedemo.com/  sayfasina gidin
        String url="https://www.saucedemo.com/";
        open(url);
        //2.  standard_user ile login olun

        sendkeys(userName,"standard_user");
        sendkeys(password,"secret_sauce");
        click(loginButton);

        //3.  listelenen ürünlerden random olarak bir tanesini secin
        click(productRandom);
        //4.  secilen ürünün adini ve fiyatini iki degiskene store edin
        String price=driver.findElement(productPrice).getText();
        String nameProduct=driver.findElement(productRandom).getText();
        //5.  ürün linkine (resim ya da isim) tiklayin
        click(productRandom);
        //6.  tiklanilan ürünün acildigini ismi ile assert edin.
        waitFor(pageProduct, Conditions.visibiltiy);
        //7.  "ADD TO CART"'a tiklayi ve o locatorin textinin da "REVOVE" oldugunu assert edin
        click(addToCardButton);
        waitFor(removeButton,Conditions.visibiltiy);
        //8.  sag üstte bulunan cart (sepet) linkine tiklayin ve cart acilsin
        click(boxShopping);
        //9.  ürünün sepette oldugunu ve fiyatinin dogru oldu oldugunu assert edin
        waitFor(cardView,Conditions.visibiltiy);
        String expectedVlue="$15.99";
        String actualVlue=driver.findElement(productPrice).getText();
        Assert.assertEquals(actualVlue,expectedVlue);
        //10. "CHECKOUT" a tiklayin
        click(checkoutButton);
        //11. formda istenilen bilgileri girin ve "CONTINUE" tiklayin
        sendkeys(firstName,"Yasin Murat");
        sendkeys(lastName,"YENI");
        sendkeys(postCode,"320001");
        click(continueButton);
        //12. Burada da isim ve fiyat kontrolü yapin ve "FINISH" e tiklayin
        String expectedProductName="Sauce Labs Bolt T-Shirt";
        String actualProductName=driver.findElement(checkoutProductName).getText();
        Assert.assertEquals(actualProductName,expectedProductName);
        String priceCheckout=driver.findElement(checkoutPrice).getText();
        String expectedPriceCheckout="Item total: $15.99";
        Assert.assertEquals(expectedPriceCheckout,priceCheckout);
        click(finishButton);
        //13. "THANK YOU FOR YOUR ORDER" yazisinin göründügünü assert edin*/
        waitFor(textThankYou,Conditions.visibiltiy);
        driver.quit();

    }

    @Test
    public void Scenario2Opencart(){

        driver=getDriver();
        wait=new WebDriverWait(driver,Duration.ofSeconds(15));
        driver.manage().window().maximize();

        //Scenario-2

        //1.  http://opencart.abstracta.us/ sayfasina gidin
        String url="http://opencart.abstracta.us";
        open(url);
        //2.  Menüde MyAccout'a tiklayin
        //.findElement(By.xpath("//span[text()='My Account']")).click();
        click(myAccount);
        //3.  Popup'in acilmasini bekleyin ve Register'a tiklayin
        click(registerButton);
        //4.  Register formun tüm alanlari doldurun ve "Continue" butonuna tiklayin
        //Bilgiler Fake olabilir.
        sendkeys(firstName2,"Yasin Murat");
        sendkeys(lastName2,"YENI");
        sendkeys(emailBox,"mucta@hotmail.com");
        sendkeys(telBox,"5454345456");
        sendkeys(passwordBox,"12345");
        sendkeys(passwordConfirmBox,"12345");
        click(agreeBox);
        click(continueButton2);
        //5.  Account'un create edildigini dogrulayin.
        waitFor(createVissible,Conditions.visibiltiy);
        click(createVissible);
        //6.  MyAccount linkinden Login'e tiklayin
        click(myAccount);
        click(logoutButton);
        click(myAccount);
        click(login2Button);
        //7.  Login bilgilerini girin ve login olun
        sendkeys(email2box,"mucta@hotmail.com");
        sendkeys(password2box,"12345");
        click(login2);
        //8.  login oldugunuzu dogrulayin
        waitFor(loginPage,Conditions.visibiltiy);
        //9.  MyAccount linkinden logout olun
        click(logout2);
         //10. Loout oldugunuzu onaylayin
        waitFor(logoutpage,Conditions.visibiltiy);
        driver.quit();

    }

    @Test
    public void Scenario3Demoqa(){
        //Scenario-3

        WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       wait=new WebDriverWait(driver, Duration.ofSeconds(15));
       driver.manage().window().maximize();
       // 1.  https://demoqa.com/webtables sayfasina gidin
       String url="https://demoqa.com/webtables";
       open(url);
        //2.  "Add" butonuna tiklayin
        click(addButton);
        //3.  "Registration Form" dialogundaki bildileri doldurun
        sendkeys(firstNameBox,"murat");
        sendkeys(lastNameBox,"YENI");
        sendkeys(userEmailBox,"ymy@gmail.com");
        sendkeys(ageBox,"47");
        sendkeys(salaryBox,"1000");
        sendkeys(departmentBox,"human research");
        //4.  "Submit" edin
        click(submidBox);
        //5.  Kaydinizin tabloda listelendigini assert edin
        waitFor(tabloVisibility,Conditions.visibiltiy);
        //6.  Kaydinizi edit edin

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300)");

       // scrollIntoView(forScrolle);
        click(editButton);
        //7.  Last name'i degistirin
        sendkeys(lastNameBox,"YENILMEZ");
        //8.  Submit edin
        click(submidBox);
        //10. Degisen lastname'in tabloda oldugunu dogrulayin
        String actualLastName=driver.findElement(changeLastName).getText();
        Assert.assertEquals(actualLastName,expectedLastName);
        //11. Girdiginiz kaydi silin
        click(cleanButton);
        //12. silindigini dogrulayin
        waitFor(changeLastName,Conditions.invisibiltiy);
        driver.quit();
    }

}

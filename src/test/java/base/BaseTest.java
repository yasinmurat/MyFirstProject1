package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Conditions;
import utilities.Driver;

public class BaseTest extends Driver {
    /*
        driver ve wait field'lari.
        BaseTest class'ini extent eden child class'lar icinde de kullanilacak
     */
    protected WebDriver driver;
    protected WebDriverWait wait;



    /**
     * bu method aldigi url ile alttaki overload methodu kullanir
     * title icin "" gönderin
     * @param url gidilecek url
     */
    protected void open(String url){
        driver.get(url);

    }

    /**
     * bu method aldigi url'e driver.get methodu ile gider
     * title'in uzunlugu >0 ise title'i contain ettigini assert eder
     * @param url gidilecek url
     * @param title sayfanin assert edilecek beklenen title'i
     */
    protected void open(String url, String title){
        driver.get(url);
        if (title.length()>0){
            Assert.assertTrue(driver.getTitle().toLowerCase().contains(title.toLowerCase()));
        }
        //TODO tamamlandı
    }

    /**
     * aldigi locator'i elemente cevirip click icin alttaki overload methoda gönderir
     * @param locator element locatori
     */
    protected void click(By locator){
        WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        click(element);

        //TODO kodlarinizi yazıldı
    }

    /**
     * aldigi elemente click eder
     * @param element element
     */
    protected void click(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

        //TODO kodlari yazıldı
    }

    /**
     * aldigi locator'i elemente cevirip sendkey icin alttaki overload methoda gönderir
     * @param locator locator
     * @param text send edilecek text
     */


    protected void sendkeys(By locator, String text){
        WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        sendkeys(element, text);

        //TODO kodlar yazıldı
    }

    /**
     * aldigi element'e text'i send eder. .clear() da yapmali
     * @param element WebElement
     * @param text send edilecek text
     */
    protected void sendkeys(WebElement element, String text){
        WebElement element1= wait.until(ExpectedConditions.visibilityOf(element));
        element1.clear();
        element1.sendKeys(text);

        //TODO kodlar yazıldı
    }

    /**
     *
     * @param locator locator
     */
    protected void scrollIntoView(By locator){

        WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        scrollIntoView(element);
        //TODO kodlar yazıldı
    }

    /**
     * aldigi elemente kadar scrollIntoView ile scroll eder
     * @param element element
     */
    protected void scrollIntoView(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView;",element);
        //TODO kodlarinizi buraya yaziniz
    }

    /**
     * aldigi y pixel kadar asagi scroll yapar
     * @param y pixel kadar asagi kaydirilir
     */
    protected void scrollBy(int y){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+y+")");
        //TODO kodlarinizi buraya yaziniz
    }
    protected void waitFor(By locator, Conditions condition){
        switch (condition){
            case clickable:
                wait.until(ExpectedConditions.elementToBeClickable(locator));
                break;
            case visibiltiy:
                wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                break;
            case invisibiltiy:
                wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
                break;
            default:
                wait.until(ExpectedConditions.presenceOfElementLocated(locator));
                break;
        }
    }


}

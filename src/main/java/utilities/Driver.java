package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

      WebDriver driver;

    WebDriverWait wait;

    /**
     * bu method overload methodu kullanarak default chrome driver return etmeli
     * @return webdriver return etmeli
     */
    public WebDriver getDriver() {
        return getDriver("Crome");
    }

    /**
     * browser parametresi ile gelen driver'i create etmeli
     * @param browser chrome, firefox, edge, ... olmali
     * @return webdriver return etmeli
     */
    public WebDriver getDriver(String browser){
        switch (browser.toLowerCase()){
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case"edge":
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            case "safari":
                WebDriverManager.safaridriver().setup();
                return new SafariDriver();
            default:
                WebDriverManager.chromiumdriver().setup();
                return new ChromeDriver();





        }
        //TODO kodlarinizi buraya yaziniz

    }

    /**
     * driver'i quit eden method
     */
    public void quitDriver(){
        driver.quit();
        //TODO kodlarinizi buraya yaziniz

    }
}

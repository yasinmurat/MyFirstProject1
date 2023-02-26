package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface LocatorsDemoqa {
    //TODO kodlarinizi buraya yaziniz
    //Demoqa'e ait locator'lar bu interface'de olmali,
    By addButton=By.id("addNewRecordButton");
    By firstNameBox=By.cssSelector("#firstName");
    By lastNameBox=By.cssSelector("#lastName");
    By userEmailBox=By.cssSelector("#userEmail");
    By ageBox=By.cssSelector("#age");
    By salaryBox=By.cssSelector("#salary");
    By departmentBox=By.cssSelector("#department");
    By submidBox=By.cssSelector("#submit");
    By tabloVisibility=By.xpath("//div[@class='col-12 mt-4 col-md-6']");
    By editButton=By.xpath("(//*[@*[contains(., 'M880 836H144c-17.7')]])[4]");
    By cleanButton=By.xpath("(//*[@*[contains(.,'M864 256H736v')]])[4]");
    By forScrolle=By.xpath("//span[text()='Dynamic Properties']");
    By changeLastName=By.xpath("//div[text()='YENILMEZ']");
    String expectedLastName="YENILMEZ";







}

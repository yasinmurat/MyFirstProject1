package locators;

import org.openqa.selenium.By;

public interface LocatorsOpencart {
    //TODO kodlarinizi buraya yaziniz
   public static final By myAccount=By.xpath("//span[text()='My Account']");
   public static final By registerButton=By.xpath("//a[text()='Register']");
   public static final By firstName2=By.cssSelector("#input-firstname");
   public static final By lastName2=By.cssSelector("#input-lastname");
   public static final By emailBox=By.cssSelector("#input-email");
   public static final By telBox=By.cssSelector("#input-telephone");
   public static final By passwordBox=By.cssSelector("#input-password");
   public static final By passwordConfirmBox=By.cssSelector("#input-confirm");
   public static final By agreeBox=By.xpath("//input[@name='agree']");
   public static final By continueButton2=By.className("btn btn-primary");




}

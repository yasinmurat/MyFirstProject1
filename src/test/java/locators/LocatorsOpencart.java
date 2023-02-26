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
   public static final By continueButton2=By.xpath("//input[@value='Continue']");
   public static final By createVissible=By.xpath("//a[text()='Success']");
   public static final By logoutButton=By.xpath("//li//a[text()='Logout']");
   public static final By login2Button=By.xpath("//ul//li//a[text()='Login']");
   public static final By email2box=By.cssSelector("#input-email");
   public static final By password2box=By.cssSelector("#input-password");
   public static final By login2=By.xpath("//div//input[@value='Login']");
   public static final By loginPage=By.xpath("//h2[text()='My Account']");
   public static final By logout2=By.xpath("(//div//a[text()='Logout'])[2]");
   public static final By logoutpage=By.xpath("//p[text()='You have been logged off your account. It is now safe to leave the computer.']");





}

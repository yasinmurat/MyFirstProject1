package locators;

import org.openqa.selenium.By;

public interface LocatorsSaucedemo {
    //TODO kodlarinizi buraya yazildı

    By userName=By.id("user-name");
    By password=By.id("password");
    By loginButton=By.id("login-button");
    By productRandom=By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']");
    By productPrice=By.xpath("//div[text()='15.99']");
    By pageProduct=By.cssSelector("#back-to-products");
    By addToCardButton=By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By removeButton=By.id("remove-sauce-labs-bolt-t-shirt");
    By boxShopping=By.xpath("//a[@class='shopping_cart_link']");
    By cardView=By.xpath("//div[@class='cart_item']");
    By checkoutButton=By.cssSelector("#checkout");
    By firstName=By.id("first-name");
    By lastName=By.id("last-name");
    By postCode=By.id("postal-code");
    By continueButton=By.id("continue");
    By checkoutProductName=By.xpath("//a/div[text()='Sauce Labs Bolt T-Shirt']");
    By checkoutPrice=By.xpath("(//div[text()='15.99'])[2]");
    By finishButton=By.cssSelector("#finish");

    By textThankYou=By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");

}

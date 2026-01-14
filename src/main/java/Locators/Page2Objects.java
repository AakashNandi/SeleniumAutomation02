package Locators;

import Browser.browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Page2Objects extends browser {
    static By fullName = By.xpath("//input[@placeholder='enter your fullName']");
    static By mailId = By.xpath("//input[@placeholder='Enter Rediffmail ID']");
    static By checkAvailability = By.xpath("//input[@value='check availability']");
    static By message = By.xpath("/input[@value='Check availability']/ancestor-or-self::*//span[@class='success']");

    public static WebElement fullNameTextbox(){
        WebElement element = driver.findElement(fullName);
        return element;
    }

    public static WebElement mailIdTextbox(){
        WebElement element = driver.findElement(mailId);
        return element;
    }

    public static WebElement checkAvailabilityButton(){
        WebElement element = driver.findElement(checkAvailability);
        return element;
    }

    public static WebElement checkAvailabilitymessage(){
        WebElement element = driver.findElement(message);
        return element;
    }
}

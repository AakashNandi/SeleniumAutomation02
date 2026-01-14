package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Browser.browser.driver;

public class Page1Objects {
    static By logo = By.xpath("//div[@class='logo']");  //will use it for wait condition
    static By createAccount = By.tagName("a");  //will use it to find create account tag

    public static WebElement logo(){
        WebElement element = driver.findElement(logo);
        return element;
    }

    //method to get element of create account link and store it

    public  static List<WebElement> link(){ //for dynamic... say want to use for another later... so that we can easily iterate and look for another tag...
        List <WebElement> element =  driver.findElements(createAccount);
        return element;
    }

}

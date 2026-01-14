package Pages;

import Browser.browser;
import Locators.Page1Objects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static Browser.browser.wait;

public class Page1 extends browser {   //we are using "wait" that was declared in browser so extended that so can be used here...

//Invoking method to get element of create account link
public static void click(String text){  //create Account
    try{
        wait.until(ExpectedConditions.visibilityOf(Page1Objects.logo()));
        List<WebElement> element = Page1Objects.link();
        for(int i=0; i<= element.size(); i++){
            if(element.get(i).getText().equalsIgnoreCase(text)){
                element.get(i).click();
                break;
            }
        }
    }catch (Exception e){
        System.out.println("Page1 - Create Account Link");
    }
}
}

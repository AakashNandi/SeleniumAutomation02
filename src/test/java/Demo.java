import Browser.browser;
import Browser.utility;
import Pages.Page1;
import Pages.Page2;
import Screenshot.capture;

public class Demo {
    public static void main(String[] args) throws Exception{
        String browserData = utility.properties("browser");
        browser.openBrowser(browserData);
        browser.navigate("Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus");  //Rediff Title when searched rediff on google
        capture.screenshot("HomePage");
        Page1.click("Create Account");
        capture.screenshot("Before Filling Details");
        Page2.fullName("Aakash Nandi");
        Page2.mailId("aakashnandi03");
        Page2.checkAvailability();
        Thread.sleep(2000);
        capture.screenshot("After Filling Details");
        Thread.sleep(4000);
        browser.closeBrowser();;
    }
}

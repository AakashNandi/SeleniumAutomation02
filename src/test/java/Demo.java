import Browser.browser;
import Browser.utility;

public class Demo {
    public static void main(String[] args) throws Exception{
        String browserData = utility.properties("browser");
        browser.openBrowser(browserData);
        browser.navigate("Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus");  //Rediff Title when searched rediff on google
        browser.closeBrowser();;
    }
}

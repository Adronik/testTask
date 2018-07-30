package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {

    public static WebDriver driver;

    public static void openBrowser() {

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("mac")){
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
        } else {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\geckodriver.exe");
        }

        driver = new FirefoxDriver();
    }

    public static void closeBrowser() {
        driver.quit();
    }

}
package Utils;

import Pages.GmailHomePage;

import java.util.concurrent.TimeUnit;

public class SiteNavigator {

    public static GmailHomePage openGmailPage() {
        WebDriverManager.driver.get("https://www.google.com/intl/ru/gmail/about/");
        return new GmailHomePage();
    }

    public static void waitForLoad() {
        WebDriverManager.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}

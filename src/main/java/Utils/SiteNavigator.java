package Utils;

import Pages.GmailHomePage;

public class SiteNavigator {

    public static GmailHomePage openGmailPage() {
        WebDriverManager.driver.get("https://www.google.com/intl/ru/gmail/about/");
        return new GmailHomePage();
    }
}

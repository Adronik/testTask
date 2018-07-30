package Utils;

import Pages.GmailHomePage;
import Pages.InboxPage;

public class SiteNavigator {

    public static GmailHomePage openGmailPage() {
        WebDriverManager.driver.get("https://www.google.com/intl/ru/gmail/about/");
        return new GmailHomePage();
    }

    public static InboxPage openInboxPage() {
        WebDriverManager.driver.get("https://mail.google.com/mail/u/0/#inbox");
        return new InboxPage();
    }
}

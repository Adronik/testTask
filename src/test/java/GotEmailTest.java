import Pages.InboxPage;
import Utils.SiteNavigator;
import Utils.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class GotEmailTest {

    public GotEmailTest() throws InterruptedException {
    }

    @BeforeMethod
    public void beforeEachTest() {
        WebDriverManager.openBrowser();
    }

    @Test
    public void emailBodyIsCorrect() throws InterruptedException {
        InboxPage inboxPage = SiteNavigator.openGmailPage().submitCredentials("test495876@gmail.com", "Qwerty12!");
        Thread.sleep(10000);
        assertTrue(inboxPage.emailBodyTextIsCorrect());
        Thread.sleep(5000);
    }


    @Test
    public void emailThemeIsCorrect() throws InterruptedException {
        InboxPage inboxPage = SiteNavigator.openGmailPage().submitCredentials("test495876@gmail.com", "Qwerty12!");
        Thread.sleep(10000);
        assertTrue(inboxPage.emailThemeTextisCorrect());
        Thread.sleep(5000);
    }


    @AfterMethod
    public void afterEachTest() {
        WebDriverManager.closeBrowser();
    }

}

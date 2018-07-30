import Pages.InboxPage;
import Utils.SiteNavigator;
import Utils.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SendEmailTest {

    @BeforeMethod
    public void beforeEachTest() {
        WebDriverManager.openBrowser();
    }

    @Test
    public void sendEmail() throws InterruptedException {
        InboxPage inboxPage = SiteNavigator.openGmailPage().submitCredentials("test495876@gmail.com", "Qwerty12!");
        Thread.sleep(10000);
        inboxPage.clickOnWriteButton().fillInEmailToField("test495876@gmail.com").fillInEmailThemeField("test Theme").fillInEmailBody("test Body").clickOnSendButton();
        Thread.sleep(10000);
    }

    @AfterMethod
    public void afterEachTest() {
        WebDriverManager.closeBrowser();
    }

}
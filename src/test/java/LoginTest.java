import Utils.SiteNavigator;
import Utils.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    @BeforeMethod
    public void beforeEachTest() {
        WebDriverManager.openBrowser();
    }

    @Test
    public void gmailLogin() throws InterruptedException {
        SiteNavigator.openGmailPage().submitCredentials("test495876@gmail.com", "Qwerty12!");
    }

    @AfterMethod
    public void afterEachTest() {
        WebDriverManager.closeBrowser();
    }

}
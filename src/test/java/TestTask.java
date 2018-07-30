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
    public void gmailLogin() {
        
    }

    @AfterMethod
    public void afterEachTest() {
        WebDriverManager.closeBrowser();
    }

}
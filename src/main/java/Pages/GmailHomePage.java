package Pages;

import Utils.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailHomePage extends BasePage {

    @FindBy(xpath = "//*[@data-g-label='Sign in']")
    private WebElement enterButton;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//span[text()='Далее']")
    private WebElement nextButton;

    /*@FindBy(xpath = "//div[@id='passwordNext']/descendant::div[contains(@class,'ZFr60d')]")
    private WebElement nextButtonAfterPassword;*/

    @FindBy(xpath = "//div[@id='passwordNext']")
    private WebElement nextButtonAfterPassword;


    public InboxPage submitCredentials (String email, String password) throws InterruptedException {
        enterButton.click();
        Thread.sleep(700);
        emailField.sendKeys(email);
        Thread.sleep(700);
        nextButton.click();
        Thread.sleep(700);
        passwordField.sendKeys(password);
        Thread.sleep(700);;
        passwordField.sendKeys(Keys.RETURN);
        Thread.sleep(700);
        return new InboxPage();
    }

}
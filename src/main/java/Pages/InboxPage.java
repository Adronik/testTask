package Pages;

import Utils.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InboxPage extends BasePage {

    @FindBy(xpath = "//div[text()='Написать']")
    private WebElement writeButton;

    @FindBy(xpath = "//input[@class='wA']/following-sibling::textarea[@name='to']")
    private WebElement toField;

    @FindBy(xpath = "//div[@class='bzm']/preceding-sibling::input")
    private WebElement themeField;

    @FindBy(xpath = "//div[text()='Отправить']")
    private WebElement sendButton;

    @FindBy(xpath = "//div[@role='textbox']")
    private WebElement textBody;


    public InboxPage clickOnWriteButton() throws InterruptedException {
        Thread.sleep(2000);
        writeButton.click();
        return new InboxPage();
    }

    public InboxPage fillInEmailToField(String emailTo) throws InterruptedException {
        Thread.sleep(400);
        toField.sendKeys(emailTo);
        return new InboxPage();
    }

    public InboxPage fillInEmailThemeField(String emailTheme) throws InterruptedException {
        Thread.sleep(700);
        themeField.sendKeys(emailTheme);
        return new InboxPage();
    }

    public InboxPage fillInEmailBody(String emailBody) throws InterruptedException {
        Thread.sleep(700);
        textBody.click();
        Thread.sleep(500);
        textBody.sendKeys(emailBody);
        return new InboxPage();
    }

    public InboxPage clickOnSendButton() throws InterruptedException {
        Thread.sleep(500);
        sendButton.click();
        return new InboxPage();
    }

}

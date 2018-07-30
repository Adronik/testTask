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

    @FindBy(xpath = "//div[@data-tooltip='Удалить']/descendant::div[@class='asa']")
    private WebElement deleteEmailButton;

    @FindBy(xpath = "//td[contains(@class,'aid')]/child::div[@role='checkbox']")
    private WebElement emailCheckbox;

    @FindBy(xpath = "//span[@class='Zt']/parent::span[@class='y2']")
    private WebElement emailBodyText;

    @FindBy(xpath = "//span[@class='bog']/child::span[@class='bqe']")
    private WebElement emailThemeText;



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

    public boolean emailThemeTextisCorrect() throws InterruptedException {
        Thread.sleep(700);
        String themeEmail = emailThemeText.getText();
        return themeEmail.equals("test Theme");
    }

    public boolean emailBodyTextIsCorrect() throws InterruptedException {
        Thread.sleep(700);
        String bodyEmail = emailBodyText.getText();
        System.out.println(bodyEmail);
        return bodyEmail.equals(" - test Body");
    }

}

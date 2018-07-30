package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailHomePage {

    @FindBy(xpath = "//*[@data-g-label='Sign in']")
    private WebElement enterButton;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath = "//span[text()='Далее']")
    private WebElement nextButton;

}

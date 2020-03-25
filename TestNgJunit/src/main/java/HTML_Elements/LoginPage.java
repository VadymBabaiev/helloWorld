package HTML_Elements;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextBlock;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, 10);

    @FindBy(xpath = "//*[@id=\"loginerror\"]")
    public TextBlock sigIn;

    @FindBy(xpath = "*//input[@value='Sign Up']")
    public Button signUp;

    @FindBy(xpath = "//div[@id='register_error']")
    public TextBlock minimumPasswordMassage;

    public boolean signIn() {
        wait.until(ExpectedConditions.visibilityOf(sigIn));
        return sigIn.isDisplayed();
    }

    public void signUp() {
        signUp.click();
    }

    public boolean minimumPasswordMassage() {
        return minimumPasswordMassage.isDisplayed();
    }

}

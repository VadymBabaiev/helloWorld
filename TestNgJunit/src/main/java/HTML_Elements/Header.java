package HTML_Elements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@FindBy(xpath = "//*[@id=\"header\"]")
public class Header extends HtmlElement {
    @FindBy(xpath = "//img[contains(@src,'logos')]")
    public HtmlElement logo;

    @FindBy(xpath = "//input[@class='ac-input completely']")
    public HtmlElement searchField;

    @FindBy(xpath = "(//input[@type='submit'])[1]")
    public Button searchButton;

    @FindBy(xpath = "(//a[@class='login'])[1]")
    public Button logIn;

    @FindBy(xpath = "//*[@id='login']//input[@type='submit']")
    public Button loginButton;

    @FindBy(xpath = "//*[@id='header_leaders']/a")
    public Button leaders;

    @FindBy(xpath = "(//a[contains(text(),'Create Account')])[1]")
    public Button createAccount;

    @FindBy(xpath = "//a[@href=\"#site_menu_link\"]")
    public Button fullSiteMenu;


    public boolean getLogo() {
        return logo.isDisplayed();
    }

    public void searchPlayer(String playerName) {
        searchField.sendKeys(playerName);
        searchButton.click();
    }

    public void emptySearch() {
        searchButton.click();
    }

    public void logInWithoutParameters() {
        logIn.click();
        loginButton.click();
    }

    public void leaders() {
        leaders.click();
    }

    public void createAccount() {
        createAccount.click();
    }

    public void fullSiteMenu() {
        fullSiteMenu.click();
    }


}

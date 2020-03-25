package Pages;

import HTML_Elements.Footer;
import HTML_Elements.Header;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Select;
import ru.yandex.qatools.htmlelements.element.TextBlock;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//a[@href='/players/'])[1]")
    public HtmlElement allPlayers;

    @FindBy(xpath = "(//a[@href='/players/a/'])[1]")
    public HtmlElement aNamePlayers;

    @FindBy(xpath = "//a[@href='/players/a/aardsda01.shtml']")
    public HtmlElement allPlayersNameStartsWithCharA;

    @FindBy(xpath = "(//a[@href='/teams/'])[3]")
    public HtmlElement allMLBTeams;

    @FindBy(xpath = "//*[@id=\"selector_1\"]")
    public Select hallOfFamer;

    @FindBy(xpath = "(//option[contains(@value,'players')])[1]")
    public Select aaronHank;

    @FindBy(xpath = "//*[@id=\"go_button\"]")
    public Button goButton;

    @FindBy(xpath = "//div[@id='sr_alert_div']")
    public TextBlock alertSelectAnOption;

    @FindBy(xpath = "//a[@href=\"#header\"]")
    public HtmlElement returnToTop;

    Header header;
    SocialMedia socialMedia;
    Footer footer;

    public boolean getLogo() {
        return header.getLogo();
    }

    public void searchPlayer(String playerName) {
        header.searchPlayer(playerName);
    }

    public void emptySearch() {
        header.emptySearch();
    }

    public boolean getSocials() {
        return socialMedia.getSocials();
    }

    public void logInWithoutParameters() {
        header.logInWithoutParameters();
    }

    public void selectTeamAndPlayer() {
        allPlayers.click();
        aNamePlayers.click();
        allPlayersNameStartsWithCharA.click();
    }

    public void selectMLBTeam() {
        allMLBTeams.click();
    }

    public void selectAHallOfFamer() {
        hallOfFamer.click();
        aaronHank.click();
    }

    public void getLeaders() {
        header.leaders();
    }

    public void getURlAbout() {
        footer.aboutInfo();
    }

    public void clickCreateAccount() {
        header.createAccount();
    }

    public void clickGoButton() {
        goButton.click();
    }

    public boolean selectAnOptionForEachAlert() {
        return alertSelectAnOption.isDisplayed();
    }

    public void fullSiteMenuButton() {
        header.fullSiteMenu();
    }

    public boolean fullSiteMenu() {
        return returnToTop.isDisplayed();
    }

}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextBlock;

public class ResultPage extends BasePage {
    public ResultPage(WebDriver driver) {
        super(driver);
    }

    SocialMedia socialMedia;
    public static final String URL_ABOUT = "https://www.sports-reference.com/about.html";

    @FindBy(xpath = "//h1[@itemprop='name']")
    public TextBlock playerName;

    @FindBy(xpath = "//div[@id='content']//p[1]")
    public TextBlock zeroHits;

    @FindBy(xpath = "//div[@class='margin-top padding']")
    public TextBlock examplesOfSuccessfulSearches;

    @FindBy(xpath = "//h1[@itemprop='name']")
    public Button h1PlayerName;

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    public TextBlock mlbTeamsAndBaseballEncyclopedia;

    @FindBy(xpath = "//a[@class=\"button\"]")
    public Button customLeaderBoardButton;

    @FindBy(xpath = "//*[@id=\"pi\"]/h1")
    public TextBlock battingSeason;


    public Boolean playerName() {
        return playerName.isDisplayed();
    }

    public boolean zeroHits() {
        return zeroHits.isDisplayed();
    }

    public boolean successfulSearches() {
        return examplesOfSuccessfulSearches.isDisplayed();
    }

    public boolean getSocials() {
        return socialMedia.getSocials();
    }

    public boolean getMoreBioPlayerInfo() {
        return h1PlayerName.isDisplayed();
    }

    public boolean getMLBteam() {
        return mlbTeamsAndBaseballEncyclopedia.isDisplayed();
    }

    public void customLeaderBoard() {
        customLeaderBoardButton.click();
    }

    public boolean battingSeason() {
        return battingSeason.isDisplayed();
    }

    public String getURlAbout() {
        return URL_ABOUT;
    }


}

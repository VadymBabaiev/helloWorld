import Pages.HomePage;
import Pages.ResultPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositiveTests {
    private static final String URL = "https://www.baseball-reference.com/";
    private static final String EXIST_PLAYER = "Paul Popovich";
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @Test
    public void checkLogoOnPage() {
        driver.navigate().to(URL);
        HomePage page = new HomePage(driver);
        assertThat(page.getLogo()).isTrue();
    }

    @Test
    public void searchPlayer() {
        driver.navigate().to(URL);
        HomePage page = new HomePage(driver);
        ResultPage resultPage = new ResultPage(driver);
        page.searchPlayer(EXIST_PLAYER);
        assertThat(resultPage.playerName()).isTrue();
    }

    @Test
    public void checkSocialOnHomePage() {
        driver.navigate().to(URL);
        HomePage page = new HomePage(driver);
        assertThat(page.getSocials()).isTrue();
    }

    @Test
    public void checkSocialOnSearchPage() {
        driver.navigate().to(URL);
        HomePage page = new HomePage(driver);
        ResultPage resultPage = new ResultPage(driver);
        page.emptySearch();
        assertThat(resultPage.getSocials()).isTrue();
    }

    @Test
    public void selectPlayerWhichNameStartWithCharAFromAllPlayers() {
        driver.navigate().to(URL);
        HomePage page = new HomePage(driver);
        ResultPage resultPage = new ResultPage(driver);
        page.selectTeamAndPlayer();
        assertThat(resultPage.getMoreBioPlayerInfo()).isTrue();
    }

    @Test
    public void selectTeamsSection() {
        driver.navigate().to(URL);
        HomePage page = new HomePage(driver);
        ResultPage resultPage = new ResultPage(driver);
        page.selectMLBTeam();
        assertThat(resultPage.getMLBteam()).isTrue();
    }

    @Test
    public void selectAHallOfFamer() {
        driver.navigate().to(URL);
        HomePage page = new HomePage(driver);
        ResultPage resultPage = new ResultPage(driver);
        page.selectAHallOfFamer();
        assertThat(resultPage.playerName()).isTrue();
    }

    @Test
    public void checkLeaderBoardSection() {
        driver.navigate().to(URL);
        HomePage page = new HomePage(driver);
        ResultPage resultPage = new ResultPage(driver);
        page.getLeaders();
        resultPage.customLeaderBoard();
        assertThat(resultPage.battingSeason()).isTrue();
    }

    @Test
    public void checkAboutSection() {
        driver.navigate().to(URL);
        HomePage page = new HomePage(driver);
        ResultPage resultPage = new ResultPage(driver);
        page.getURlAbout();
        assertThat(resultPage.getURlAbout().equals(driver.getCurrentUrl()));
    }

    @Test
    public void checkFullSiteMenu() {
        driver.navigate().to(URL);
        HomePage page = new HomePage(driver);
        page.fullSiteMenuButton();
        assertThat(page.fullSiteMenu()).isTrue();
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }

}

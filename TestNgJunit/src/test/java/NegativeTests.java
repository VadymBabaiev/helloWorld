import HTML_Elements.LoginPage;
import Pages.HomePage;
import Pages.ResultPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NegativeTests {
    private static final String URL = "https://www.baseball-reference.com/";
    private static final String NOT_EXIST_PLAYER = "Vadym Babaiev";
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @Test
    public void searchNonExistentPlayer() {
        driver.navigate().to(URL);
        HomePage page = new HomePage(driver);
        ResultPage resultPage = new ResultPage(driver);
        page.searchPlayer(NOT_EXIST_PLAYER);
        assertThat(resultPage.zeroHits()).isTrue();
    }


    @AfterTest
    public void tearDown() {
        driver.close();
    }

}


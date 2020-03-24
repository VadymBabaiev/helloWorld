import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;

public class MyTest {
    private WebDriver driver;
    private static final String URL = "http://www.google.com";
    private static final String INPUT = "q";
    private static final String SEARCH = "Selenium";
    private static final String ACTUAL = "Selenium — Вікіпедія";
    private static final String FIRST_LINK = "(//a//h3)[1]";

    @BeforeTest
    public void precondition() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(URL);
    }

    @Test
    public void SearchTest() {
        driver.navigate().to(URL);
        WebElement element = driver.findElement(By.name(INPUT));
        element.sendKeys(SEARCH);
        element.submit();
        driver.findElement(By.xpath(FIRST_LINK)).click();
        assertEquals(driver.getTitle(),ACTUAL);
    }

    @AfterTest
    public void postCondition() {
        driver.close();
    }

}



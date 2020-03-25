package Pages;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextBlock;

@FindBy(xpath = "//*[@id=\"social\"]")
public class SocialMedia extends HtmlElement {
    @FindBy(xpath = "//div[@id='social']")
    TextBlock socials;

    public boolean getSocials() {
        return socials.isDisplayed();
    }
}

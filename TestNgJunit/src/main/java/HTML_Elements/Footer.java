package HTML_Elements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextBlock;

@FindBy(xpath = "//*[@id='about']")
public class Footer extends HtmlElement {
    @FindBy(xpath = "//*[@id=\"about\"]/a[1]")
    public TextBlock about;

    public void aboutInfo() {
        about.click();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class SearchBox extends BasePage{
    By searchBoxLocator = By.cssSelector(".desktopOldAutosuggestTheme-input");
    By searchButtonLocator = By.cssSelector(".SearchBoxOld-buttonContainer");

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator , text);
        click(searchButtonLocator);

    }
}

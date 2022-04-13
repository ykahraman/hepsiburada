import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordPage extends BasePage {

    By passwordBoxLocator = new By.ByXPath("//input[@id='txtPassword'");
    By btnSetPassword = new By.ByXPath("//button[@id='btnEmailSelect']");

    public PasswordPage (WebDriver driver) {
        super(driver);
    }
    public boolean isOnPasswordPage() {
        return isDisplayed(passwordBoxLocator);
    }

    public void secondStep(String text) {
        type(passwordBoxLocator , text);
        click(btnSetPassword);
    }

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.awt.SystemColor.text;

public class EmailOrPhonePage extends BasePage{

    By emailBox = By.id("txtUserName");
    By btnLogin = By.id("btn.Login");

    public EmailOrPhonePage(WebDriver driver) {
        super(driver);
    }

    public void firstStep(String text) {
        type(emailBox , text);
        click(btnLogin);
    }

    }



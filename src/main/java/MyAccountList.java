import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyAccountList extends BasePage{

    EmailOrPhonePage emailOrPhonePage;
    By giris = By.id("login");

    public MyAccountList(WebDriver driver) {
        super(driver);
    }

    public void openMyAccountList(){
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(new By.ByXPath("//div[@id='myAccount']/span/span"));
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[@id='myAccount']/span/span"))).click().build().perform();
        click(giris);
    }

    public EmailOrPhonePage emailOrPhonePage(){
        return this.emailOrPhonePage;
    }
}

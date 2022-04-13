import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProductsPage extends BasePage {
    By productListLocator = By.id ("ProductList");
    By productLocator = By.id("i0");


    public ProductsPage(WebDriver driver) {
        super(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public boolean isOnProductsPage() {
        return isDisplayed(productListLocator);
    }
    public void selectProduct(){
        click(productLocator);

    }

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class ProductDetailPage extends BasePage {
    By addToCartButtonLocator = new By.ByCssSelector(".addToCartButton [id='addToCart'");
    By fromDifferentSellerAddToCartButton = new By.ByCssSelector("div[class*='marketplace-list']>table [class*='form-area'] [class='addToCart']");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartButtonLocator);
    }


    public void addToCart() {
        click(addToCartButtonLocator);
        }

    public void addToCartFromDifferentSeller() {
        click(fromDifferentSellerAddToCartButton);
    }
}





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {

    By basketItemCount = By.id("basket-item-count");

    public CartPage(WebDriver driver) {
        super(driver);
    }
    public boolean checkIfProductAdded() {
        return getBasketItemCount() >0 ;
    }
    private int getBasketItemCount(){
        String count = find(basketItemCount).getText();
        return Integer.parseInt(count);
    }

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {
    SearchBox searchBox;
    MyAccountList myAccountList;
    By cartItemCountLocator = By.id("cartItemCount");
    By shoppingCartLocator = By.id("shoppingCart");
    
    public HomePage(WebDriver driver) {
        super(driver);
        searchBox=new SearchBox(driver);
    }

    public MyAccountList MyAccountList() {
        return this.myAccountList;
    }
    public SearchBox searchBox(){
        return this.searchBox;
    }
    public boolean isProductCountUp() {
        return getCartCount()>0;
    }
    public void goToCart() {
        click(shoppingCartLocator);
    }


    private int getCartCount(){
        String count= find(cartItemCountLocator).getText();
        return Integer.parseInt(count);
    }


}

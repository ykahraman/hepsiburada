import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


public class Search_And_Add_Product_To_Cart extends BaseTest{

     HomePage homePage ;
     ProductsPage productsPage ;
     ProductDetailPage productDetailPage ;
     CartPage cartPage ;

    @Test
    @Order(1)
    public void search_product(){
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("Pia Mater");
        Assertions.assertTrue(productsPage.isOnProductsPage(),
                "Not on products page!");
        }

    @Test
    @Order(2)
    public void select_product(){
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct();
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),
                "Not on product detail page!");
        }

    @Test
    @Order(3)
    public void add_product_to_cart(){
        productDetailPage.addToCart();
        Assertions.assertTrue((Boolean) homePage.isProductCountUp(),
        "Product count did not increase!");
        }

    @Test
    @Order(4)
    public void add_product_to_cart_from_different_seller(){
        productDetailPage.addToCartFromDifferentSeller();
        Assertions.assertTrue((Boolean) homePage.isProductCountUp(),
                "Product count did not increase!");
        }

    @Test
    @Order(5)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded(),
                "Product was not added to cart!");
    }
}

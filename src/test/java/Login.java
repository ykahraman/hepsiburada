import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Login extends BaseTest{

    EmailOrPhonePage emailOrPhonePage;
    PasswordPage passwordPage;
    HomePage homePage;
    MyAccountList myAccountList;


    @Test
    @Order(1)
    public void firstStepLogin(){
        homePage = new HomePage(driver);
        myAccountList = new MyAccountList(driver);
        emailOrPhonePage = new EmailOrPhonePage(driver);
        myAccountList.openMyAccountList();
        myAccountList.emailOrPhonePage().firstStep("ye.sim.2002@gmail.com");
        Assertions.assertTrue(passwordPage.isOnPasswordPage(),
                "Not on password page!");
    }

    @Test
    @Order(2)
    public void secondStepLogin(){
        passwordPage = new PasswordPage(driver);


    }
}

package ebay;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignInPageTestCase extends WebAPI {

    static SignInPage signInPage;

    public static void getInitElements(){

        signInPage= PageFactory.initElements(driver,SignInPage.class);
    }

   /* @Test(enabled = false)
    public void testCase1() throws InterruptedException {
        getInitElements();
        signInPage.createAccount();
    }*/

    @Test
    public  void testCase2(){

        getInitElements();
        signInPage.signInWithValidCradential();
    }
}

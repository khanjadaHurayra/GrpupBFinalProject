package conEdison;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTestCases extends WebAPI {

    static HomePage homePage;

    public static void getInitElements(){

        homePage= PageFactory.initElements(driver, HomePage.class);
    }

    @Test

    public void testCase1(){
        getInitElements();
        homePage.mouseOverOnAccountButton();
    }
}

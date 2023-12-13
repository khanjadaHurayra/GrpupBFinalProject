package ebay;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCases extends WebAPI {

   static EbayHomePage homePageEbay;

    public static void getInitElements(){
        homePageEbay= PageFactory.initElements(driver,EbayHomePage.class);

    }

   @Test
   public void testCase1(){

        getInitElements();
        homePageEbay.searchItem();

    }
}

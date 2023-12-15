package ebay;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCases extends WebAPI {

    static EbayHomePage homePageEbay;

    public static void getInitElements() {
        homePageEbay = PageFactory.initElements(driver, EbayHomePage.class);
    }

    @Test
    public void testCase1() throws InterruptedException {

        getInitElements();
        homePageEbay.searchItem();
        homePageEbay.getUrl();


    }

    @Test(enabled = true)
    public  void testCase2(){

        getInitElements();
        homePageEbay.mouseOverOnCollectibleTabAndSelectStamp();
    }

    @Test
    public void testcase3() throws InterruptedException {
        getInitElements();
        homePageEbay.clickOnTwitterLink();
        Thread.sleep(5000);
    }
}

package ebay;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends WebAPI {

    static EbayHomePage homePageEbay;

    public static void getInitElements() {

        homePageEbay = PageFactory.initElements(driver, EbayHomePage.class);
    }

    @Test(enabled = true,priority  =1)
    public void testCase1() throws InterruptedException {

        getInitElements();
        homePageEbay.searchItem();
        homePageEbay.getUrl();
        Assert.assertEquals(driver.getTitle(),"shirts for sale | eBay");

    }

    @Test(enabled = true,priority = 2)
    public  void testCase2(){

        getInitElements();
        homePageEbay.mouseOverOnCollectibleTabAndSelectStamp();
        Assert.assertEquals(driver.getTitle(),"Stamps for sale | eBay");

    }

    @Test(enabled = true,priority = 3)
    public void testcase3() throws InterruptedException {
        getInitElements();
        homePageEbay.clickOnTwitterLink();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(),"eBay (@eBay) / X");
    }

    @Test(enabled = true,priority = 4)
    public void testCase4(){

        getInitElements();
        homePageEbay.clickOnHelpAndSupport();
        Assert.assertEquals(driver.getTitle(),"Security Measure");
    }
}

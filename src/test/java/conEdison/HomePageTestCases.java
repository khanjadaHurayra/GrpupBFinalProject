package conEdison;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTestCases extends WebAPI {

    static HomePage homePage;

    public static void getInitElements(){

        homePage= PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1)
    public void testCase1(){
        getInitElements();
        homePage.mouseOverOnAccountButton();

    }

    @Test(priority = 2)
    public void testCase2(){
        getInitElements();
        homePage.scrollThePageAndClickOnRatesOn();

    }

    @Test(priority = 3,alwaysRun = true)
    public void testCase3(){
        getInitElements();
        homePage.ClickOnSearchButton();
        Assert.assertEquals(driver.getTitle(),"Con Edison - Powering New York City and Westchester");
    }
    @Test(priority = 4)
    public void testCase4(){
        getInitElements();
        homePage.clickOnTopic();
        Assert.assertEquals(driver.getTitle(),"Con Edison - Powering New York City and Westchester");
    }
    @Test (enabled = true)
    public void testCase5(){
        getInitElements();
        homePage.sustainabilityHighlights();
        Assert.assertEquals(driver.getTitle(),"Our Clean Energy Commitment | Con Edison");
    }
    @Test (enabled = true)
    public void testCase6(){
        getInitElements();
        homePage.changingServiceAddress();
        Assert.assertEquals(driver.getTitle(),"Start, Move, or Stop Service | Con Edison");
    }
    @Test
    public void testCase7(){
        getInitElements();
        homePage.stopServiceCurrentLocation();
        //Assert.assertEquals(driver.getTitle(),"Start, Move, or Stop Service | Con Edison");
    }
}

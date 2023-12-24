package americanAirlines;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AirlinesHomePageTestCases extends WebAPI {

    static Homepage homepage;

    public static void getInitElements() {

        homepage = PageFactory.initElements(driver, Homepage.class);
    }

    @Test(priority = 1)
    public void verifyRoundTripButtonSelected() {
        getInitElements();
        homepage.roundTripChecked();
    }

    @Test(priority = 2)
    public void verifySearchButton() {
        getInitElements();
        homepage.clickOnAirportSearch();
        implicitWait(10);
        Assert.assertEquals("American Airlines - Airline tickets and low fares at aa.com", driver.getTitle());
    }

    @Test(priority = 3)
    public void verifyCountryAndRegionCanSlelect() {

        getInitElements();
        homepage.clickOnCityOrAirportSearch();

    }

    @Test
    public void returnBagInformation() {
        getInitElements();
        homepage.refundBagsInfoPageAllMethods();
    }

    // @Test (enabled = true)
    public void testCase1() {
        getInitElements();
        //homePageAmericanAirlines.manageTripAllMethods();
        homepage.manageTripCheckIn();
        homepage.inputLastName();
        homepage.inputConfirmation();
        homepage.clickFindYourTripButton();

    }

    @Test(enabled = true)
    public void testCase3() {
        getInitElements();
        homepage.bagAnfFees();
        Assert.assertEquals(driver.getTitle(), "Checked bag policy − Travel information − American Airlines");
    }

}

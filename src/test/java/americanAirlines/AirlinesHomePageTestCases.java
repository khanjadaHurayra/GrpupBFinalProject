package americanAirlines;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AirlinesHomePageTestCases extends WebAPI {

    static Homepage homepage;

    public static void getInitElements(){
        homepage= PageFactory.initElements(driver,Homepage.class);
    }

    @Test(priority = 1)
    public void verifyRoundTripButtonSelected(){
        getInitElements();
        homepage.roundTripChecked();
    }
}

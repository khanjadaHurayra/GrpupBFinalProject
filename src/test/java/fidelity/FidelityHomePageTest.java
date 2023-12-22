package fidelity;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FidelityHomePageTest extends WebAPI {

    static HomePage homePage;

    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void verifyCareerOption() {
        getInitElements();
        homePage.clickOnCareerLInkOption();
    }
}

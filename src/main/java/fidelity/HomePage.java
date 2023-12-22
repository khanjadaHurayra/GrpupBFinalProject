package fidelity;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static fidelity.WebElements.careerLinkID;

public class HomePage extends WebAPI {

    @FindBy(how = How.ID,using = careerLinkID)
    public WebElement careerLink;

    public void clickOnCareerLInkOption(){
        scrollUpDownByHeight();
        careerLink.click();
    }
}

package fidelity;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import static fidelity.WebElements.*;

public class HomePage extends WebAPI {

    @FindBy(how = How.ID, using = careerLinkID)
    public WebElement careerLink;

    @FindBy(how = How.XPATH, using = cookiesAcceptAllXpath)
    public WebElement cookiesAcceptAll;

    @FindBy(how = How.XPATH, using = iputKeyWordFieldXpath)
    public WebElement iputKeyWordField;

    @FindBy(how = How.XPATH, using = iputCareerAreaXpath)
    public WebElement iputCareerArea;

    @FindBy(how = How.XPATH, using = selectBAndProjectManagementXpath)
    public WebElement selectBAndProjectManagement;

    @FindBy(how = How.ID, using = locationFieldID)
    public WebElement locationField;

    @FindBy(how = How.XPATH, using = searchJobXpath)
    public WebElement searchJob;

    @FindBy(how = How.ID, using = locationSelectNYusaID)
    public WebElement locationSelectNYusa;


    public void validateAssert() {

        String actual = driver.getTitle();
        String expected = "Home | Award-Winning Careers & Best Workplaces | Fidelity Careers";

        Assert.assertEquals(expected,actual);
    }

    public void clickOnCareerLInkOption() throws InterruptedException {
        scrollUpDownByHeight();
        careerLink.click();
        cookiesAcceptAll.click();
        iputKeyWordField.click();
        iputKeyWordField.sendKeys("IT");
        System.out.println("Enterd Something on the field");
        iputCareerArea.click();
        selectBAndProjectManagement.click();
        locationField.click();
        locationField.sendKeys("New York");
        locationSelectNYusa.click();
        searchJob.click();
        //validateAssert();


        //selectOptionByVisibleText(selectBAndProjectManagement,"Business Analysis & Project Management");
    }
}

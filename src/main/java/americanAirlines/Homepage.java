package americanAirlines;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static americanAirlines.WebElements.*;

public class Homepage extends WebAPI {

    @FindBy(how = How.XPATH, using = roundTripRadioXpath)
    public WebElement roundTripRadio;

    @FindBy(how = How.XPATH, using = airportSearchXpath)
    public WebElement airportSearchButton;

    @FindBy(how = How.XPATH, using = cityOrAirportSearchXpath)
    public WebElement cityOrAirportSearch;

    @FindBy(how = How.XPATH, using = selectCountryOrRigionXpath)
    public WebElement selectCountryOrRigion;

    @FindBy(how = How.XPATH, using = selectBangladeshOptionXpath)
    public WebElement selectBangladeshOption;

    @FindBy(how = How.XPATH, using = selectNumberOfPassengerXpath)
    public WebElement selectNumberOfPassenger;

    @FindBy(how = How.XPATH, using = numberOfPassengerXpath)
    public WebElement numberOfPassenger;

    @FindBy(how = How.ID, using = closeButtonID)
    public WebElement closeButton;


    public void roundTripChecked() {
        roundTripRadio.isSelected();
        System.out.println("Habib vai");

    }

    public void clickOnAirportSearch() {
        scrollUpDownByHeight();
        airportSearchButton.click();

    }

    public void clickOnCityOrAirportSearch() {
        scrollUpDownByHeight();
        cityOrAirportSearch.click();
        selectCountryOrRigion.click();
        selectBangladeshOption.click();
        //selectNumberOfPassenger.click();
       // numberOfPassenger.click();


    }


}

package americanAirlines;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static americanAirlines.WebElements.roundTripRadioXpath;

public class Homepage extends WebAPI {

    @FindBy(how = How.XPATH, using = roundTripRadioXpath)
    public WebElement roundTripRadio;


    public void roundTripChecked(){
        roundTripRadio.isSelected() ;
        System.out.println("Habib vai");

    }


}

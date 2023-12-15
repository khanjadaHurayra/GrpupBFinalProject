package conEdison;

import common.WebAPI;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static conEdison.WebElement.accountAndBillingButtonId;
import static conEdison.WebElement.payAsaGuestOptionXpath;
/*import static conEdison.WebElements.*;*/


public class HomePage extends WebAPI {

    @FindBy(how = How.ID, using = accountAndBillingButtonId)
    public WebElement accountAndBillingButton;

    @FindBy(how = How.XPATH,using = payAsaGuestOptionXpath)
    public WebElement payAsaGuestOption;


    public void mouseOverOnAccountButton(){

       mouseHover(accountAndBillingButton);



    }

    public void getUrl() throws InterruptedException {
        getCurrentUrl();
        Thread.sleep(4000);
    }
}

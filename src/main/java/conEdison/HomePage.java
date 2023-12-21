package conEdison;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static conEdison.WebElements.*;
/*import static conEdison.WebElements.*;*/


public class HomePage extends WebAPI {

    @FindBy(how = How.ID, using = accountAndBillingButtonId)
    public WebElement accountAndBillingButton;

    @FindBy(how = How.XPATH,using = payAsaGuestOptionXpath)
    public WebElement payAsaGuestOption;

    @FindBy(how =How.LINK_TEXT,using=RatesAndTariffsLinkText )
    public WebElement ratesAndTariffsOption;

    @FindBy(how =How.XPATH,using = searchButtonXpath)
    public WebElement searchButton;

    @FindBy(how =How.XPATH,using =searchBoxXpath)
    public WebElement searchBox;

    @FindBy(how =How.XPATH,using=topicDropdownXpath)
    public WebElement topicDropdown;


    public void mouseOverOnAccountButton(){

       mouseHover(accountAndBillingButton);
       payAsaGuestOption.click();
    }

    public void scrollThePageAndClickOnRatesOn(){
        scrollUpDownByHeight();
        ratesAndTariffsOption.click();

    }

    public void ClickOnSearchButton()  {
        searchButton.click();
        searchButton.sendKeys("sample bill");

        searchButton.sendKeys(Keys.ENTER);

       /* searchBox.click();
        searchBox.sendKeys("sample bills");
        searchBox.sendKeys(Keys.ENTER);*/

    }

    public void clickOnTopic(){


        try{
        searchButton.click();
        searchBox.sendKeys("sample bill");
        searchBox.sendKeys(Keys.ENTER);
        selectDropDownByIndex(topicDropdown,1);}
        catch(Exception e) {

            System.out.println("Captcha Stop It ");

        }

    }


    public void getUrl() throws InterruptedException {
        getCurrentUrl();
        Thread.sleep(4000);
    }
}

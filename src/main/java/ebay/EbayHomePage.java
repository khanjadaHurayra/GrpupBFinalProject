package ebay;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static ebay.WebElements.inputSearchFieldXpath;
import static ebay.WebElements.submitButtonXpath;


public class EbayHomePage extends WebAPI {

    @FindBy(how = How.XPATH,using = inputSearchFieldXpath)
    public WebElement searchFieldWebElement;

    @FindBy(how = How.XPATH,using = submitButtonXpath)
    public WebElement submitButtonWebElement;


    public void inputSearchField(){

        searchFieldWebElement.click();
        searchFieldWebElement.sendKeys("shirts");

    }

    public void submit(){
        submitButtonWebElement.click();
    }

    public void searchItem(){
        inputSearchField();
        submit();
    }
    public void getUrl() throws InterruptedException {
        getCurrentUrl();
        Thread.sleep(4000);
    }

}

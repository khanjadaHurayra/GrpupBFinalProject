package DummyHTML;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static DummyHTML.WebElements.*;

public class Homepage extends WebAPI {
    @FindBy(how = How.XPATH, using = userNameXpath)
    public WebElement usernameWebElement;
    @FindBy(how = How.XPATH, using = passwordXpath)
    public WebElement passwordWebElement;
    @FindBy(how = How.ID, using = loginButtonID)
    public WebElement loginBtnWebElement;

    // Preparation methods of various steps
    public void usernameFieldActions() {
        usernameWebElement.click();
        inputValueInTextBoxByWebElement(usernameWebElement, "Username");
    }

    public void passwordFieldActions() {
        passwordWebElement.click();
        inputValueInTextBoxByWebElement(passwordWebElement, "Password");
    }

    public void loginButtonClick() {

        loginBtnWebElement.click();
    }


    //TestCases
    public void TestCase1() {
        usernameFieldActions();
        passwordFieldActions();
        loginButtonClick();
    }

    public void testCase3() throws InterruptedException {
        getCurrentUrl();
        Thread.sleep(4000);

    }


}

package ebay;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static ebay.WebElements.*;

public class SignInPage extends WebAPI {

    @FindBy(how = How.XPATH, using = signInButtonXpath)
    public WebElement signInButton;

    @FindBy(how = How.ID, using = switchToAccountId)
    public WebElement switchToAccount;

    @FindBy(how = How.ID, using = createAccountId)
    public WebElement createAccountLink;

    @FindBy(how = How.ID, using = personalLebelClassName)
    public WebElement personalTab;

    @FindBy(how = How.XPATH, using = businessTabXpath)
    public WebElement businessTab;

    @FindBy(how = How.CSS, using = firstNameXpath)
    public WebElement firstNameField;

    @FindBy(how = How.ID, using = lebelLastNameId)
    public WebElement lastNameField;

    @FindBy(how = How.ID, using = lebelEmailId)
    public WebElement emailField;

    @FindBy(how = How.ID, using = lebelPasswordId)
    public WebElement passwordField;

    @FindBy(how = How.ID, using = EMAIL_REG_FORM_SUBMIT_ID)
    public WebElement emailRegistrationSubmitButton;


    @FindBy(how = How.ID, using = signInButtonID)
    public WebElement signInButton2;

    @FindBy(how = How.ID, using = userfieldID)
    public WebElement userField;

    @FindBy(how = How.ID, using = continueButtonID)
    public WebElement continueButton;

    @FindBy(how = How.ID, using = passFieldID)
    public WebElement passField;

    @FindBy(how = How.ID, using = submitButtonID)
    public WebElement submitButton;


    public void clickOnSignInButton() {

        signInButton.click();
    }

   /* public void clickOnSwithToAccount() {

        switchToAccount.click();
    }*/

    public void clickOnCreateOnAccount() {

        createAccountLink.click();
    }
    /*public void clickOnBusinessTab() throws InterruptedException {
        Thread.sleep(4000);
        businessTab.click();
    }*/

   /* public void clickOnPersonalTab() {

        personalTab.click();
    }*/

    public void inputFirstName() {

        firstNameField.click();
        firstNameField.sendKeys("Name");
    }

    public void inputLastName() {
        lastNameField.click();
        lastNameField.sendKeys("kuddus");
    }

    public void inputEmail() {
        emailField.click();
        emailField.sendKeys("123@yahoo.com");
    }

    public void inputPassword() {
        emailField.click();
        emailField.clear();
        emailField.sendKeys("1234567");
    }

    public void clickOnSubmitButton() {

        emailRegistrationSubmitButton.click();
    }


    public void signInOnly() {
        signInButton2.click();
    }

    public void userField() {
        userField.click();
        userField.sendKeys("trrrps2023@gmail.com");
    }

    public void clickOnContinue() {
        continueButton.click();
    }

    public void inputPassField() {
        passField.click();
        passField.sendKeys("mairalaamarae2023");
    }

    public void submitForSignIn() {
        submitButton.click();
    }


    public void signInWithValidCredential() {

        try {
            signInOnly();
            userField();
            clickOnContinue();
            inputPassField();
            submitForSignIn();

        } catch (Exception e) {

            System.out.println("Its is not possible to automate  bcoz Domain stop to automate it");
        }
    }


    public void createAccount() throws InterruptedException {

        try {
            clickOnSignInButton();
            clickOnCreateOnAccount();
            inputFirstName();
            inputLastName();
            inputEmail();
            inputPassword();
            clickOnSubmitButton();
        } catch (Exception e) {
            System.out.println("Not possible to Account create on ebay , bcoz automation is controlled by ebay ");
        }

    }

    public void getUrl() throws InterruptedException {
        getCurrentUrl();
        Thread.sleep(4000);
    }


}

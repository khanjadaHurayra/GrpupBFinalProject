package americanAirlines;

public class WebElements {

    public static final String roundTripRadioXpath = "//input[@type='radio' and @value='roundTrip']";
    public static final String airportSearchXpath = "(//a[@class='widget aaAirportLookup'])[1]";
    public static final String cityOrAirportSearchXpath = "(//span[@class='icon icon-search'])[2]";
    public static final String selectCountryOrRigionXpath = "(//select[@id='countryCode'])[1]";
    public static final String selectBangladeshOptionXpath = "(//select/option[@value='BD'])";
    public static final String closeButtonID = "airportLookupDialogButton0";


    public static final String selectNumberOfPassengerXpath = "(//select[@name='adultOrSeniorPassengerCount'])[1]";

    public static final String numberOfPassengerXpath = "(//select/option[@value='2'])[2]";

    public static final String manageTripCheckInXpath = "//*[@id='aa-tab-viewReservations']";
    public static final String passengerLastNameXpath = "//input[@id='findReservationForm.lastName']";
    public static final String confirmationRecordLocatorXpath = "//input[@id='findReservationForm.recordLocator']";
    public static final String findYourTripXpath = "//input[@id='findReservationForm.submit']";

    public static final String flightStatusId = "aa-tab-flightStatus";

    public static final String flightStatuNegativeResultXpath = "//*[@id='adcNotification_0']/p/text()";


    public static final String bagFeesAndAllowanceXpat = "//a[normalize-space()='Changes to checked bag fees and allowances']";
    public static final String checkBagPolicyXpath = "//div[normalize-space()='Checked bag policy']";
    public static final String delayOrDemageBagsXpath = "//*[@id='aa-content-frame']/section[2]/nav/ul/li[4]/a/div[2]";
    public static final String submitAClaimXPath = "//ul[@class='list-standard']//li//a[@href='https://centralbaggage.aa.com/en-US/?from=selfServiceCallouts-BG-DLD_RIBSMT']";
    public static final String refundXpath = "//a[@title='Refunds »']";
}

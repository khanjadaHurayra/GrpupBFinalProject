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
}

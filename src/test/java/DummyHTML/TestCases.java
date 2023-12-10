package DummyHTML;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCases extends WebAPI {
        static Homepage homepage;


    public static void getInitElements() {

        homepage = PageFactory.initElements(driver, Homepage.class);
    }

    @Test(enabled = false)
    public void TestCase1(){

        getInitElements();
        homepage.TestCase1();
    }

    @Test
    public  void testCAse3() throws InterruptedException {

        getInitElements();
        homepage.testCase3();

    }


}

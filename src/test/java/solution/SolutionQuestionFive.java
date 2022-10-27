package solution;

import base.BaseClass;
import org.testng.annotations.Test;
import pageobject.HomePage;

public class SolutionQuestionFive extends BaseClass {
//With Java and selenium launch browser and launch http://www.xe.com
//Enter the 5$ in “Amount" field and select US in “From” dropdown and
//select the INR from “To" field and click on the convert button.
//Read the converted value and display the value
    HomePage homePage;
    @Test
    public void getINRValue()
    {
        launchBrowser(); // Launching browser with given URL
        homePage = new HomePage(driver);
        homePage.enterAmount("5"); // Entering amount as 5 $
        homePage.enterFromCurrency("USD"); // Entering FROM currency as USD
        homePage.enterToCurrency("INR");  //Entering To currency as INR
        homePage.clickOnConvertBtn(); // Clicking on convert button
        homePage.readConvertedValue(); //Reading converted value

    }

}

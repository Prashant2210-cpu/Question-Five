package pageobject;

import base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BaseClass {
    WebDriverWait wait;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    ;

    @FindBy (id = "amount")
    WebElement amount;

    @FindBy (id = "midmarketFromCurrency")
    WebElement from;

    @FindBy (id = "midmarketToCurrency")
    WebElement to;

    @FindBy (xpath = "//button[@type ='submit']")
    WebElement convertBtn;

    @FindBy (xpath = "//div[contains(@class, 'currency-converter__GridContainer')]/following-sibling::div/div/p[2]")
    WebElement resultText;

    public void enterAmount(String value)
    {

        amount.click();
        amount.sendKeys(value);
    }
    public void enterFromCurrency(String fromCurrency)
    {

        from.click();
        from.sendKeys(fromCurrency, Keys.ENTER);

    }

    public void enterToCurrency(String toCurrency)
    {
        to.click();
        to.sendKeys(toCurrency, Keys.ENTER);
    }

    public void clickOnConvertBtn()
    {
        convertBtn.click();
    }

    public void readConvertedValue()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(resultText));
        System.out.println(resultText.getText());
    }

}

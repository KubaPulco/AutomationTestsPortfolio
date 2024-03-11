package wkdzik.pl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class UbraniaPage extends BasePage {
    @FindBy(xpath = "//img[@alt='DZIK® BASIC - BLUZA FIOLETOWA']")
    WebElement purpleHoodie;

    @FindBy(xpath = "//img[@alt='DZIK® BASIC - BLUZA CHOCOLATE']")
    WebElement chocolateHoodie;

    // size
    @FindBy(xpath = "//div[@value='308']")
    WebElement sizeL;

    @FindBy(xpath = "//div[@value='307']")
    WebElement sizeM;

    @FindBy(xpath = "//div[@value='305']")
    WebElement sizeXS;
    // add to cart
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[6]/div[1]/div[2]/button[1]/span[1]")
    WebElement addToCartButton;

    @FindBy(xpath = "//a[@class='btn btn-red right']")
    WebElement subbmitButton;

    @FindBy(xpath = "//h5[normalize-space()='Typ produktu']")
    WebElement typeOfProdcuct;

    @FindBy(xpath = "//a[@title='Bluzy']")
    WebElement hoodies;

    public UbraniaPage(WebDriver driver) {
        super(driver);
    }

    public void clickTheHoodie() throws InterruptedException {
        typeOfProdcuct.click();
        Thread.sleep(1000);
        hoodies.click();
        purpleHoodie.click();
        sizeXS.click();
        Thread.sleep(1000);
        addToCartButton.click();
        Thread.sleep(3000);
        subbmitButton.click();
    }
}
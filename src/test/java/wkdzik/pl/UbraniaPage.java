package wkdzik.pl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class UbraniaPage extends BasePage {
    @FindBy(xpath = "//img[@alt='DZIK® BASIC - BLUZA FIOLETOWA']")
    WebElement hoodie1;

    // size
    @FindBy(xpath = "//div[@value='308']")
    WebElement size;

    // add to cart
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[6]/div[1]/div[2]/button[1]")
    WebElement addToCartButton;

    @FindBy(xpath = "//a[@class='btn btn-red right']")
    WebElement subbmitButton;

    public UbraniaPage(WebDriver driver) {
        super(driver);
    }

    public void clickTheFirstItem() throws InterruptedException {
    hoodie1.click();
    size.click();
    addToCartButton.submit();
    Thread.sleep(1000);
    subbmitButton.click();

    }
}

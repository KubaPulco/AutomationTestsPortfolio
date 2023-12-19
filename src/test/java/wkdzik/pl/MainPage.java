package wkdzik.pl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage{


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void acceptCookies(){
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[1]/div[2]/button[1]")).click();
    }

    public void clickNowosci(){
        nowosci.click();
    }

    public void clickAndSearch(String itemName) throws InterruptedException {
        search.click();
        Thread.sleep(1000);
        searchForm.sendKeys(itemName + Keys.ENTER);

    }



}

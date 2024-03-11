package wkdzik.pl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class MainPage extends BasePage{


    public MainPage(WebDriver driver) {
        super(driver);
    }




    public void clickAndSearch(String itemName) throws InterruptedException {
        search.click();
        Thread.sleep(1000);
        searchForm.sendKeys(itemName + Keys.ENTER);

    }
}

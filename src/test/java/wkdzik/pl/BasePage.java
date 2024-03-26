package wkdzik.pl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;


    //Sort
    @FindBy(className = "products-active-sort")
    WebElement sort;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[3]/b[1]")
    WebElement priceAscending;


    public void acceptCookies(){
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[1]/div[2]/button[1]")).click();
    }



    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void sortItemsAscending() throws InterruptedException {
        sort.click();
        Thread.sleep(2000);
        priceAscending.click();
        Thread.sleep(2000);
    }
}
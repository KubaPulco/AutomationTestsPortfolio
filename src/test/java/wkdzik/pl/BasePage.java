package wkdzik.pl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage {
    WebDriver driver = null;

    // TOP menu
    @FindBy(xpath = "//a[@id='headlink48']//span[contains(text(),'PRODUKTY DZIK®')])")
    WebElement produkty;

    @FindBy(xpath = "//span[contains(text(),'NOWOŚCI')]")
    WebElement nowosci;

    @FindBy(xpath = "//a[@id='headlink24']//span[contains(text(),'Ubrania')]")
    WebElement ubrania;

    @FindBy(xpath = "//span[normalize-space()='Akcesoria']")
    WebElement akcesoria;

    @FindBy(xpath = "//span[contains(text(),'Suplementy i odżywianie')]")
    WebElement suplementy_i_odzywianie;

    @FindBy(xpath = "//span[normalize-space()='Lookbook']")
    WebElement lookbook;

    @FindBy(xpath = "//span[@id='src-open-btn']//*[name()='svg']")
    WebElement search;

    @FindBy(className = "search__input")
    WebElement searchForm;
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

    public void sortItems() throws InterruptedException {
        sort.click();
        Thread.sleep(2000);
        priceAscending.click();
        Thread.sleep(2000);
    }
}
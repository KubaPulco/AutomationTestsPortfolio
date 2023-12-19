package wkdzik.pl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    WebDriver driver = null;

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

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
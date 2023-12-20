package wkdzik.pl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage{
    //Dane zamawiajacego i adres dostawy
    @FindBy(xpath = "//input[@placeholder='e-mail']")
    WebElement emailInput;

    @FindBy(xpath = "//input[@placeholder='Imię']")
    WebElement nameInput;

    @FindBy(xpath = "//input[@placeholder='Nazwisko']")
    WebElement lastNameInput;

    @FindBy(xpath = "//input[@placeholder='Telefon']")
    WebElement phoneInput;

    @FindBy(xpath = "//label[@class='el-checkbox one-row-checkbox register inline']//span[@class='el-checkbox__inner']")
    WebElement registerCheckbox;

    @FindBy(xpath = "//span[normalize-space()='Paragon']")
    WebElement receiptButton;

    @FindBy(xpath = "//span[normalize-space()='Faktura']")
    WebElement invoiceButton;

    @FindBy(xpath = "//span[contains(text(),'Faktura na os. fizyczną')]")
    WebElement invoiceButton2;


    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public void fillTheForm(String email, String name, String lastName, String phoneNumber){
        emailInput.sendKeys(email);
        nameInput.sendKeys(name);
        lastNameInput.sendKeys(lastName);
        phoneInput.sendKeys(phoneNumber);


    }

}

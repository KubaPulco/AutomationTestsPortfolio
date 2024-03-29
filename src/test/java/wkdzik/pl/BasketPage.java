package wkdzik.pl;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BasketPage extends BasePage{
    //Dane zamawiajacego
    @FindBy(xpath = "//input[@placeholder='e-mail']")
    WebElement emailInput;

    @FindBy(xpath = "//input[@placeholder='Imię']")
    WebElement nameInput;

    @FindBy(xpath = "//input[@placeholder='Nazwisko']")
    WebElement lastNameInput;

    @FindBy(xpath = "//input[@placeholder='Telefon']")
    WebElement phoneInput;


    //Country dropdown
    @FindBy(xpath = "//*[@id=\"app\"]/form/div[12]/div[3]/div[1]/div[2]/div[8]/div/div/div/span/span/i")
    WebElement findCountryDropdown;

    @FindBy(xpath = "//ul[contains(@class, 'el-select-dropdown__list')]//li/span")
    List <WebElement> elementsOfTheCountryList;


    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public void fillTheForm(String email, String name, String lastName, String phoneNumber){
        emailInput.sendKeys(email);
        nameInput.sendKeys(name);
        lastNameInput.sendKeys(lastName);
        phoneInput.sendKeys(phoneNumber);
    }

    public void clickCountryByName(String countryName) throws InterruptedException {
        findCountryDropdown.click();
        Thread.sleep(3000);

        for (WebElement country : elementsOfTheCountryList) {
            if (country.getText().trim().equals(countryName)) {
                country.click();
                return; // Zakończ pętlę po kliknięciu znalezionego kraju
            }
        }
        System.out.println("Nie można znaleźć kraju: " + countryName);

    }
}

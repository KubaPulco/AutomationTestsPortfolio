package wkdzik.pl;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;



public class MainPageTests {
    WebDriverConfig config = new WebDriverConfig();
    WebDriver driver = config.getDriver("edge") ; // Wybór przeglądarki chrome,firefox,edge
    // Wykonaj testy z użyciem 'driver'

      @Test
    public void testGuwno() throws InterruptedException {



          MainPage mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        driver.get("https://wkdzik.pl");
        mainPage.acceptCookies();
        mainPage.clickAndSearch("Spodnie Dresowe");

        driver.quit();

      }
}
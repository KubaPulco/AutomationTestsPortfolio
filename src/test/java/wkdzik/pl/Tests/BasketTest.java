package wkdzik.pl.Tests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import wkdzik.pl.BasketPage;
import wkdzik.pl.UbraniaPage;
import wkdzik.pl.WebDriverConfig.WebDriverConfig;

public class BasketTest {
    private static final Logger logger = LogManager.getLogger(BasketTest.class);

    WebDriverConfig config = new WebDriverConfig();
    WebDriver driver = config.getDriver("edge");
    BasketPage basketPage = new BasketPage(driver);
    UbraniaPage ubraniaPage = new UbraniaPage(driver);

    @Test
    public void basketGeneralTest()  {
        try {
            logger.info("Rozpoczęcie testu basketGeneralTest");

            logger.info("Powiększenie okna");
            driver.manage().window().maximize();

            logger.info("Wejście na stronę sklepu");
            driver.get("https://wkdzik.pl/ubrania");

            logger.info("Akceptacja plików cookie");
            basketPage.acceptCookies();

            logger.info("Kliknięcie w przedmiot");
            ubraniaPage.clickTheHoodie();

            Thread.sleep(4000);
            logger.info("Wypełnianie formularza");
            basketPage.fillTheForm("ahaspoko@gmail.com", "Jakub", "Pałacz","213721372");
            basketPage.clickCountryByName("Niemcy");
            Thread.sleep(3000);

        } catch (Exception e) {
            logger.error("Wystąpił błąd: " + e.getMessage());
        } finally {
            logger.info("Zamknięcie przeglądarki");
            driver.quit();
        }
    }
}


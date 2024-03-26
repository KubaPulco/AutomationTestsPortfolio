package wkdzik.pl.Tests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import wkdzik.pl.MainPage;
import wkdzik.pl.WebDriverConfig.WebDriverConfig;


public class MainPageTests {
    WebDriverConfig config = new WebDriverConfig();
    WebDriver driver = config.getDriver("chrome") ; // Wybór przeglądarki chrome,firefox,edge
    MainPage mainPage = new MainPage(driver);
    private static final Logger logger = LogManager.getLogger(MainPageTests.class);
      @Test
    public void testSortItemsAscending() {
          try {
              logger.info("Rozpoczynam test testSortItemsAscending");
              driver.manage().window().maximize();
              driver.get("https://wkdzik.pl/ubrania");

              mainPage.acceptCookies();
              Thread.sleep(2000);
              mainPage.sortItemsAscending();
              Thread.sleep(3000);
              driver.quit();
          } catch (Exception e) {
              logger.error("Wystąpił błąd: " + e.getMessage());
          } finally {
              logger.info("Zamknięcie przeglądarki");
              driver.quit();
          }
      }
}
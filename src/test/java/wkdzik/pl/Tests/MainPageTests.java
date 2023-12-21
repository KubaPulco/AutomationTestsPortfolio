package wkdzik.pl.Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import wkdzik.pl.MainPage;
import wkdzik.pl.WebDriverConfig.WebDriverConfig;


public class MainPageTests {
    WebDriverConfig config = new WebDriverConfig();
    WebDriver driver = config.getDriver("edge") ; // Wybór przeglądarki chrome,firefox,edge


      @Test
    public void testGuwno() throws InterruptedException {

          MainPage mainPage = new MainPage(driver);
        driver.manage().window().maximize();
                  driver.get("https://wkdzik.pl/ubrania");

        mainPage.acceptCookies();
          Thread.sleep(2000);
        mainPage.sortItemsAscending();
      }
}
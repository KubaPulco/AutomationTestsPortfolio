package wkdzik.pl.Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import wkdzik.pl.BasePage;
import wkdzik.pl.MainPage;
import wkdzik.pl.WebDriverConfig;


public class MainPageTests {
    WebDriverConfig config = new WebDriverConfig();
    WebDriver driver = config.getDriver("edge") ; // Wybór przeglądarki chrome,firefox,edge
    // Wykonaj testy z użyciem 'driver'

      @Test
    public void testGuwno() throws InterruptedException {

          MainPage mainPage = new MainPage(driver);
        driver.manage().window().maximize();
                  driver.get("https://wkdzik.pl/ubrania");

        mainPage.acceptCookies();
          Thread.sleep(2000);
        mainPage.sortItemsAscending();
      }

//      @Test
//    public void basketTest(){
//          driver.manage().window().maximize();
//          driver.get("https://wkdzik.pl/ubrania");
//      }
}
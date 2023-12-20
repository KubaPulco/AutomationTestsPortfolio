package wkdzik.pl.Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import wkdzik.pl.BasePage;
import wkdzik.pl.BasketPage;
import wkdzik.pl.UbraniaPage;
import wkdzik.pl.WebDriverConfig;

public class BasketTest {
    WebDriverConfig config = new WebDriverConfig();
    WebDriver driver = config.getDriver("edge");
    BasketPage basketPage = new BasketPage(driver);
    UbraniaPage ubraniaPage = new UbraniaPage(driver);
    @Test
    public void basketGeneralTest() throws InterruptedException {



        driver.manage().window().maximize();
          driver.get("https://wkdzik.pl/ubrania");
        basketPage.acceptCookies();
        ubraniaPage.clickTheFirstItem();
        Thread.sleep(2000);
        basketPage.fillTheForm("ahaspoko@gmail.com", "Jakub", "Pała","2137");
        Thread.sleep(10000);
        driver.quit();

    }
}
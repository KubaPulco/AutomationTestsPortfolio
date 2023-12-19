package wkdzik.pl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverConfig {
    private WebDriver driver;

    public WebDriver getDriver(String browser) {
        if (browser.equals("chrome")) {

            ChromeOptions options = new ChromeOptions();
            // Konfiguracja opcji przeglądarki (np. tryb headless)
            driver = new ChromeDriver(options);
        } else if (browser.equals("firefox")) {

            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);

        } else if (browser.equals("edge")) {
            EdgeOptions options = new EdgeOptions();

            driver = new EdgeDriver(options);

        }
        // Dodaj więcej warunków dla innych przeglądarek

        return driver;
    }
}

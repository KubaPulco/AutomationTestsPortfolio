package wkdzik.pl.WebDriverConfig;

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
        switch (browser) {
            case "chrome" -> {

                ChromeOptions options = new ChromeOptions();
                driver = new ChromeDriver(options);

                break;
            }
            case "firefox" -> {

                FirefoxOptions options = new FirefoxOptions();
                driver = new FirefoxDriver(options);

                break;
            }
            case "edge" -> {
                EdgeOptions options = new EdgeOptions();

                driver = new EdgeDriver(options);
                break;
            }
        }
        // Można dodać więcej warunków dla większej liczby przeglądarek

        return driver;
    }
}

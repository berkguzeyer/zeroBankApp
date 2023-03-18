package cucumber.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Driver_Base {

    private static WebDriver driver;

    public static WebDriver getDriver() {

        // I am using this method which is "Singleton Driver".
        if (driver == null) {
            // always open clean browser we don't want open new driver again and again
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*"); // To solve the error with Chrome v111
            Locale.setDefault(new Locale("EN"));
            System.setProperty("user.language", "EN");
            Logger.getLogger("").setLevel(Level.SEVERE);
            System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
        }

        return driver;
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripTests {

    WebDriver driver;

    // Generic function to launch the browser based on the type passed (Chrome/Firefox)
    public WebDriver launchBrowser(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized"); // Option to start maximized
            return new ChromeDriver(options);
        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--start-maximized"); // Option to start maximized
            return new FirefoxDriver(options);
        }
        return null;
    }

    // Function to check if the logo is present
    public boolean isLogoPresent() {
        try {
            WebElement logo = driver.findElement(By.xpath("//img[@alt='MakeMyTrip']"));
            return logo.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    // Generic function to wait for element visibility
    public WebElement waitForElement(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    // Launch browser before every method
    @BeforeMethod
    public void setUp() {
        driver = launchBrowser("chrome");  // You can change to "firefox" for Firefox browser
        driver.get("https://www.makemytrip.com/");
    }

    // Test case for verifying MakeMyTrip logo is present (Task 1)
    @Test
    public void testLogoPresence() {
        boolean isLogoVisible = isLogoPresent();
        Assert.assertTrue(isLogoVisible, "MakeMyTrip Logo is not visible on the page.");
        Reporter.log("Logo is displayed: " + isLogoVisible);
    }

    // Test case for interacting with the page elements like Flights and OneWay (Task 2)
    @Test
    public void testFlightSelection() {
        // Click on Flights
        WebElement flightsTab = waitForElement(By.xpath("//span[text()='Flights']"));
        flightsTab.click();

        // Select OneWay
        WebElement oneWayOption = waitForElement(By.xpath("//li[@data-cy='oneWay']"));
        oneWayOption.click();

        // Enter "FROM" location
        WebElement fromLocation = waitForElement(By.xpath("//input[@placeholder='From']"));
        fromLocation.sendKeys("New York");

        // Enter "TO" location
        WebElement toLocation = waitForElement(By.xpath("//input[@placeholder='To']"));
        toLocation.sendKeys("London");

        Reporter.log("Flight search initiated with FROM = New York, TO = London.");
    }

    // Clean up and close the browser after the tests
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class MakeMyTripAutomation {

    // Initialize WebDriver
    public static WebDriver initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe"); // Specify path to chromedriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Maximize the window at the start
        return new ChromeDriver(options);
    }

    // Launch the URL
    public static void launchPage(WebDriver driver, String url) {
        driver.get(url);
    }

    // Generic function to click on an element using XPath
    public static void clickElementByXPath(WebDriver driver, String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
    }

    // Generic function to send keys to an input field
    public static void sendKeysToElement(WebDriver driver, String xpath, String text) {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.clear(); // Clear any existing text
        element.sendKeys(text);
    }

    // Function to select 'OneWay' option
    public static void selectOneWay(WebDriver driver) {
        String oneWayXpath = "//*[text()='One Way']";  // XPath for OneWay button (verify if this works)
        clickElementByXPath(driver, oneWayXpath);
    }

    // Function to enter 'FROM' and 'TO' locations
    public static void enterFromToLocations(WebDriver driver, String fromLocation, String toLocation) {
        String fromFieldXPath = "//input[@placeholder='From']";  // XPath for 'From' location input field
        String toFieldXPath = "//input[@placeholder='To']";      // XPath for 'To' location input field

        // Click on the 'From' field before entering text
        clickElementByXPath(driver, fromFieldXPath);
        sendKeysToElement(driver, fromFieldXPath, fromLocation);

        // Wait for and select the first suggestion for 'From' location
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@role='listbox']/li[1]"))).click();

        // Click on the 'To' field before entering text
        clickElementByXPath(driver, toFieldXPath);
        sendKeysToElement(driver, toFieldXPath, toLocation);

        // Wait for and select the first suggestion for 'To' location
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@role='listbox']/li[1]"))).click();
    }

    // Main program execution
    public static void main(String[] args) {
        WebDriver driver = initializeDriver();

        try {
            launchPage(driver, "https://www.makemytrip.com/");  // Launch the website
            Thread.sleep(3000);  // Wait for the page to load (use WebDriverWait in production)

            // Click on the Flights tab
            String flightsXpath = "//*[text()='Flights']";  // XPath for Flights button
            clickElementByXPath(driver, flightsXpath);

            Thread.sleep(2000);  // Wait for any page transitions
            
            // Select OneWay option
            selectOneWay(driver);

            // Enter 'FROM' and 'TO' locations
            enterFromToLocations(driver, "New York", "London");

            // Wait to view the results or any subsequent actions
            Thread.sleep(5000);  // Wait for search results to load or adjust based on page load time
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();  // Close the browser after completion
        }
    }
}

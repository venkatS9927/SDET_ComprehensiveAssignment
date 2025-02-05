package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import java.time.Duration;

public class VerifyLogoPresence {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe"); // Update the path to geckodriver

        // Initialize Firefox browser
        FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = new FirefoxDriver(options);

        try {
            // Open the MakeMyTrip website
            driver.get("https://www.makemytrip.com/");

            // Wait for the logo to be visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[src*='makemytrip']")));

            // If the logo is found and visible, print success message
            System.out.println("MakeMyTrip logo is present on the page.");

        } catch (Exception e) {
            System.out.println("MakeMyTrip logo is not found on the page.");
        } finally {
            // Close the browser after verification
            driver.quit();
        }
    }
}

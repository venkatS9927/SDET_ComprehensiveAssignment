import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager

@pytest.fixture(scope="module")
def setup_browser():
    # Setup the Chrome driver using WebDriver Manager
    driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
    driver.get("https://www.w3schools.com/")
    yield driver
    driver.quit()

def test_w3schools_logo(setup_browser):
    # Find the logo element by its alt text or another unique identifier
    driver = setup_browser
    try:
        logo = driver.find_element(By.XPATH, "//a[@title='W3Schools Home']/img")
        assert logo.is_displayed(), "W3Schools logo is not displayed on the page"
    except Exception as e:
        pytest.fail(f"Test failed due to exception: {e}")


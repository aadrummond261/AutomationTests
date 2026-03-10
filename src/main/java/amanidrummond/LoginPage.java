package amanidrummond;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("submit");
    private final By successMessage = By.cssSelector(".post-title");
    private final By errorMessage = By.id("error");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
    }

    public void enterUsername(String username) {
        WebElement userField = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
        userField.clear();
        userField.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passField = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        passField.clear();
        passField.sendKeys(password);
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getSuccessMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).getText().trim();
    }

    public String getErrorMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage)).getText().trim();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}

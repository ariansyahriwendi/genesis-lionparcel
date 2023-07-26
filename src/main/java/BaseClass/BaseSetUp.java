package BaseClass;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseSetUp {
    public static WebDriver driver;
    private static final Properties properties = new Properties();


    public static void getDriver() throws IOException {
        InputStream input = new FileInputStream("properties/browser.properties");
        properties.load(input);
        System.setProperty(properties.getProperty("DRIVER_NAME"), properties.getProperty("Chrome_DRIVER_PATH"));
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static String getUrl() {
        return properties.getProperty("WEB_URL");
    }

    public static void openWebsite(String websiteUrl) {
        driver.navigate().to(websiteUrl);
    }

    public static void quitWebsite() {
        driver.quit();
    }

    public static void maximizeWebsite() {
        driver.manage().window().maximize();
    }

    public static void clickButton(By by) {
        WebElement element = driver.findElement(by);
        element.click();
    }

    public static void inputText(By by, String text) {
        WebElement element = driver.findElement(by);
        element.sendKeys(text);
    }

    public static void isDisplayed(By by) {
        WebElement element = driver.findElement(by);
        element.isDisplayed();
    }

    public static void selectAllAndDelete() {
        Actions action = new Actions(driver);
        action.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).sendKeys(Keys.DELETE).build().perform();
    }

}

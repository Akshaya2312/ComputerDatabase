package testbase;
import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import utilities.ConfigRead;
import static org.slf4j.LoggerFactory.getLogger;

public class TestBase
{
    protected WebDriver driver;
    private static final Logger LOGGER = getLogger(TestBase.class);

    public WebDriver setupApplication()
    {
        if(ConfigRead.getProperty("browser").equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if(ConfigRead.getProperty("browser").equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(ConfigRead.getProperty("browser").equalsIgnoreCase("internetexplorer"))
        {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }
        else if(ConfigRead.getProperty("browser").equalsIgnoreCase("edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        else
        {
            LOGGER.info("please give correct browser name");
        }
        driver.get(ConfigRead.getProperty("Url"));
        driver.manage().window().maximize();
        LOGGER.info("application lanched successfully");
        return driver;
    }


    public  void closeApplication()
    {
        driver.quit();
    }

    /**
     * gets current webdriver
     * @return current driver
     */
    protected WebDriver getWebDriver() {
        return driver;
    }

    /**
     *  finds element in application
     * @param element
     * @return webelement if it finds
     */
   public WebElement findElement(WebDriver driver,By element){
        return driver.findElement(element);
    }

    /**
     * waits for element to be present in application
     * @param elementdriver
     * @param webelement
     * @return
     */
    public WebElement waitForElementPresent(WebDriver elementdriver,By webelement){
        WebElement myDynamicElement = (new WebDriverWait(elementdriver, 20))
                .until(ExpectedConditions.presenceOfElementLocated(webelement));
        return myDynamicElement;
    }

    /**
     * waits for element to be visible in application
     * @param elementdriver
     * @param webelement
     * @return
     */
    public WebElement waitForElementVisible(WebDriver elementdriver,By webelement){
        WebElement myDynamicElement = (new WebDriverWait(elementdriver, 20))
                .until(ExpectedConditions.visibilityOfElementLocated(webelement));
        return myDynamicElement;
    }


}
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import testbase.TestBase;
import static org.slf4j.LoggerFactory.getLogger;
import org.openqa.selenium.support.ui.Select;

   /**
   * Representation of computer pages
   */
    public class Computer extends TestBase {
    private static final Logger LOGGER = getLogger(Computer.class);
    WebDriver driver;
    private By addComputer = By.id("add");
    private By delete = By.cssSelector("input.btn.danger");
    private By computerName = By.cssSelector("input[id='name']");
    private By introductionDate = By.cssSelector("input[id='introduced']");
    private By discontinuedDate = By.cssSelector("input[id='discontinued']");
    private By add = By.cssSelector("input[type='submit']");
    private By searchBox = By.cssSelector("input[type='search']");
    private By searchFind = By.cssSelector("input[type='submit']");
    private By cancel= By.cssSelector("a.btn[href='/computers']");

    public Computer(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Creates new Computer
     * @param compName
     * @param companyName
     * @param iDate
     * @param dDate
     */

    public void createComputer(String compName, String iDate, String dDate, String companyName) {
        waitForElementPresent(driver, addComputer);
        findElement(driver, addComputer).click();
        waitForElementPresent(driver, computerName);
        findElement(driver, computerName).sendKeys(compName);
        findElement(driver, introductionDate).sendKeys(iDate);
        findElement(driver, discontinuedDate).sendKeys(dDate);
        Select company = new Select(driver.findElement(By.id("company")));
        company.selectByVisibleText(companyName);
        waitForElementVisible(driver, add);
        findElement(driver, add).click();
        LOGGER.info("computer created ..");

    }

       /**
        * Cancel new Computer
        * @param compName
        * @param companyName
        * @param iDate
        * @param dDate
        */

       public void cancelComputer(String compName, String iDate, String dDate, String companyName) {
           waitForElementPresent(driver, addComputer);
           findElement(driver, addComputer).click();
           waitForElementPresent(driver, computerName);
           findElement(driver, computerName).sendKeys(compName);
           findElement(driver, introductionDate).sendKeys(iDate);
           findElement(driver, discontinuedDate).sendKeys(dDate);
           Select company = new Select(driver.findElement(By.id("company")));
           company.selectByVisibleText(companyName);
           waitForElementVisible(driver, cancel);
           findElement(driver, cancel).click();
           LOGGER.info("computer cancelled ...");

       }
       /**
     * Edits Already created Computer
     * @param compName
     * @param companyName
     * @param iDate
     * @param dDate
     */
    public void editComputer(String compName, String iDate, String dDate, String companyName) {
        waitForElementPresent(driver, computerName);
        findElement(driver, computerName).clear();
        findElement(driver, computerName).sendKeys(compName);
        waitForElementPresent(driver, discontinuedDate);
        findElement(driver, discontinuedDate).clear();
        findElement(driver, discontinuedDate).sendKeys(iDate);
        waitForElementPresent(driver, introductionDate);
        findElement(driver, introductionDate).clear();
        findElement(driver, introductionDate).sendKeys(dDate);
        Select company = new Select(driver.findElement(By.id("company")));
        company.selectByVisibleText(companyName);
        waitForElementPresent(driver, add);
        findElement(driver, add).click();
        LOGGER.info("computer edited ..");
    }
    /**
     * Delete computer
     */
    public void deleteComputer() {
        waitForElementPresent(driver, delete);
        findElement(driver, delete).click();
        LOGGER.info("computer deleted ..");
    }
    /**
     * Search deleted computer
     */
    public Boolean searchDeletedComputer(String compName) {

        waitForElementPresent(driver, searchBox);
        findElement(driver, searchBox).clear();
        findElement(driver, searchBox).sendKeys(compName);
        waitForElementPresent(driver, searchFind);
        findElement(driver, searchFind).click();
        WebElement baseTable = driver.findElement(By.tagName("em"));
        String tableRow = baseTable.getAttribute("innerHTML");
        if ("Nothing to display".equals(tableRow)) {
            return Boolean.TRUE;
        }

        return Boolean.FALSE;

    }
    /**
     * selects specific Computer
     * @param compName
     */
    public boolean selectSpecificComputer(String compName) {

        waitForElementPresent(driver, searchBox);
        findElement(driver, searchBox).clear();
        findElement(driver, searchBox).sendKeys(compName);
        waitForElementPresent(driver, searchFind);
        findElement(driver, searchFind).click();
        WebElement baseTable = driver.findElement(By.tagName("table"));
        WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr/td[1]/a"));
        String rowtext = tableRow.getText();
        tableRow.click();
        if (compName.equals(rowtext)) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }

    }

    /**
     * Computer details
     * @param compName
     * @param companyName
     * @param iDate
     * @param dDate
     */
    public boolean computerDetails(String compName, String iDate, String dDate, String companyName) {
        Select select = new Select(driver.findElement(By.xpath(".//*[@id='company']")));
        WebElement option = select.getFirstSelectedOption();
        String defaultItem = option.getText();
        if (compName.equals(findElement(driver, computerName).getAttribute("value")) &&
                iDate.equals(findElement(driver, discontinuedDate).getAttribute("value")) &&
                dDate.equals(findElement(driver, introductionDate).getAttribute("value")) &&
                iDate.equals(findElement(driver, discontinuedDate).getAttribute("value")) &&
                companyName.equals(defaultItem) ) {
            return Boolean.TRUE;
        }
            else  {

                return Boolean.FALSE;
            }
        }
    }


package Stepdefinations;

import Pages.Computer;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import testbase.TestBase;
import utilities.ConfigRead;
import static org.slf4j.LoggerFactory.getLogger;

public class ComputerTest extends TestBase {

    private static final Logger LOGGER = getLogger(ComputerTest.class);
    WebDriver webDriver;
    TestBase testBase;
    Computer computer;
    String compName;
    String dDate;
    String iDate;
    String companyName;
    String initialCount;
    /**
     * Intialize the  setup for each feature
     */
    @Before
    public void setup() {

        testBase = new TestBase();
        webDriver= testBase.setupApplication();
        computer = new Computer(webDriver);
        compName=ConfigRead.getComputerName();
        iDate=ConfigRead.getDate();
        dDate=ConfigRead.getDate();
        companyName=ConfigRead.getCompanyName();

    }
    /**
     * Close the application after each feature
     */
    @After
    public void exit() {
        testBase.closeApplication();
    }
    /**
     * Create Feature
     * Scenario  User is able to add new computer in computer database
     */
    @Given("^User is able to launch the application$")
    public void user_is_able_to_launch_the_application()  {
        LOGGER.info("user launch the application in successfully");
    }
    @When("^User click on add button and fill computer details and click create button$")
    public void user_click_on_add_button_and_fill_computer_details_and_click_create_button()   {
        computer.createComputer(compName,iDate,dDate,companyName);
    }
    @Then("^Computer is added in database$")
    public void computer_is_added_in_database()  {
       computer.selectSpecificComputer(compName);

    }
    /**
     *  Feature- Create
     * Scenario: User is able to click cancel button and computer is not created
     */
    @When("^User click on add button and fill computer details and click cancel button$")
    public void user_click_on_add_button_and_fill_computer_details_and_click_cancel_button()  {
        computer.cancelComputer(compName,iDate,dDate,companyName);

    }
    @Then("^Computer is not added in database$")
    public void computer_is_not_added_in_database()  {
    computer.searchDeletedComputer(compName);
    }

   /**
     * Read Feature
     * Scenario: User able to view details of computer
     */
    @Given("^Computer is in database$")
    public void computer_is_in_database() {
       computer.createComputer(compName,iDate,dDate,companyName);
    }
    @When("^User click on computer in computer database list$")
    public void user_click_on_computer_in_computer_database_list() {
        computer.selectSpecificComputer(compName);

    }
    @Then("^User is able to see the details of computer$")
    public void user_is_able_to_see_the_details_of_computer() {
        boolean employeedetailsfound  = computer.computerDetails(compName,iDate,dDate,companyName);
        System.out.println(employeedetailsfound);
        Assert.assertTrue(employeedetailsfound);

    }
    /**
     * Edit feature
     * Scenario: User is able to edit details of Computer
     */
    @Given("^Computer is present in computer database$")
    public void computer_is_present_in_computer_database()  {
        computer.createComputer(compName,iDate,dDate,companyName);
    }

    @When("^User edit the details of computer$")
    public void user_edit_the_details_of_computer()  {
        computer.selectSpecificComputer(compName);
        compName=ConfigRead.getComputerName();
        iDate=ConfigRead.getDate();
        dDate=ConfigRead.getDate();
        companyName=ConfigRead.getCompanyName();
        computer.editComputer(compName,iDate,dDate,companyName);
    }

    @Then("^New details should be added$")
    public void new_details_should_be_added(){
        computer.selectSpecificComputer(compName);
        boolean employeedetailsfound  = computer.computerDetails(compName,iDate,dDate,companyName);
        System.out.println(employeedetailsfound);
        Assert.assertTrue(employeedetailsfound);

    }
     /**
     * Feature delete
     *
     * * */
    @Given("^Computer is present in computer database list$")
    public void computer_is_present_in_computer_database_list() {
        computer.createComputer(compName,iDate,dDate,companyName);
    }


    @When("^User click on delete button$")
    public void user_click_on_delete_button() {
        computer.selectSpecificComputer(compName);
        computer.deleteComputer();
    }

    @Then("^User get deleted from computer list$")
    public void user_get_deleted_from_computer_list(){
        Boolean compFound = computer.searchDeletedComputer(compName);
        Assert.assertTrue(compFound);
    }
}


package steps;

import common.PageManager;
import common.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import tests.BaseTest;

public class WebTablesSteps extends BaseTest {
    PageManager pageManager = new PageManager();
    ScenarioContext scenarioContext = new ScenarioContext();

    @Given("Open the web site webtables")
    public void open_the_web_site_webtables() {
        pageManager.WebTablesPage.openWebTables();
    }

    @When("user clicks the ADD button")
    public void clickAddBtn() {
        pageManager.WebTablesPage.addButtonClick.click();
    }

    @Then("open the table")
    public void istableVisible() {
        Assertions.assertThat(pageManager.WebTablesPage.table.getText()).isEqualTo("Registration Form");
    }

    @When("Enter data")
    public void fillingTable() {
        pageManager.WebTablesPage.fillTable();
    }

    @Then("User clicks the submit button")
    public void clickSubmit() {
        pageManager.WebTablesPage.submitClick.click();
    }

    @When("User clicks edit button")
    public void clickEditButton() {
        pageManager.WebTablesPage.edt.click();
    }
    @When("user change age value as 45")
    public void setNewAge(){
        pageManager.WebTablesPage.inputAge.setValue("23");
    }
    @Then("User submits new age")
    public void submitNewAge(){
        clickSubmit();
    }
}
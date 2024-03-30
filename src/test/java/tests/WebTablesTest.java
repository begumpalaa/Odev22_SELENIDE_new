package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import pages.WebTables;
import steps.WebTablesSteps;

public class WebTablesTest extends BaseTest {
    WebTablesSteps appliedTabelSteps = new WebTablesSteps();
    private WebTables webTables;

    @Test(priority = 1)
    public void openTablePage() {
        pageManager.WebTablesPage.openWebTables();
    }

    @Test(priority = 2)
    public void clickAdd() {
        pageManager.WebTablesPage.clickAddButton();
    }

    @Test(priority = 3)
    public void fillingTable() {
        Configuration.timeout = 20000;
        WebTables.inputName.setValue("Begüm");
        WebTables.inputSurname.setValue("pala");
        WebTables.inputAge.setValue("29");
        WebTables.inputEmail.setValue("begum.pala@gmail.com");
        WebTables.inputSalary.setValue("324");
        WebTables.inputDepartment.setValue("QA");

    }

    @Test(priority = 4)

    public void submitData() {
        appliedTabelSteps.clickSubmit();
    }

    @Test(priority = 5)
    public void clickEditButton() {
        appliedTabelSteps.clickEditButton();
    }

    @Test(priority = 6)
    public void newAge() {
        appliedTabelSteps.setNewAge();
    }

    @Test(priority = 7)
    public void submitNewAge() {
        appliedTabelSteps.submitNewAge();
    }
}
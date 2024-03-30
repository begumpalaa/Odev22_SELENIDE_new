package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class WebTables extends BasePage{

    public static SelenideElement inputName = $("#firstName");
    public static SelenideElement inputSurname = $("#lastName");
    public static SelenideElement inputAge = $("#age");
    public static SelenideElement inputEmail = $("#userEmail");
    public static SelenideElement inputSalary = $("#salary");
    public static SelenideElement inputDepartment = $("#department");
    public static SelenideElement submitClick = $("#submit");
    public static SelenideElement edt = $("span#edit-record-4");
    public static SelenideElement addButtonClick = $("#addNewRecordButton");
    public static SelenideElement table =$("#registration-form-modal");
    public WebTables(String pageUrl) {
        super(pageUrl);
    }

    public void fillTable() {
        WebTables.inputName.setValue("Begüm");
        WebTables.inputSurname.setValue("pala");
        WebTables.inputAge.setValue("29");
        WebTables.inputEmail.setValue("begum.pala@gmail.com");
        WebTables.inputSalary.setValue("324");
        WebTables.inputDepartment.setValue("QA");
    }
    public void clickAddButton(){
        addButtonClick.click();
    }
}
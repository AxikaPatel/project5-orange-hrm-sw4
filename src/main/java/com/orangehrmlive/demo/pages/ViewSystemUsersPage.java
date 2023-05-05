package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility
{

    By systemUsersText = By.xpath("//h5[normalize-space()='System Users']");
    //By addButton = By.xpath("//button[normalize-space()='Add']");
    By usernameField = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
    By userRoleField = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By employeeNameField = By.xpath("//input[@placeholder='Type for hints...']");
    By statusField = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]");
    By searchButton = By.xpath("//button[normalize-space()='Search']");
    By userInResultList = By.xpath("//span[normalize-space()='(1) Record Found']");
    By checkbox = By.xpath("//div[@role='columnheader']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']");
    By deleteButton = By.xpath("//i[@class='oxd-icon bi-trash']");
    By yesDelete = By.xpath("//button[normalize-space()='Yes, Delete']");
    By successfullyDeleted = By.linkText("Successfully Deleted");


    public String systemUsersText() {
        return getTextFromElement(systemUsersText);
    }

    public void enterUsername(String username) {
        sendTextToElement(usernameField, username);
    }


    public void selectUserRoleFromDropDown(String userRole)
    {
        waitAndClick(userRoleField);
        selectByVisibleTextFromDropDown(userRoleField, userRole);
    }

    public void enterEmployeeName(String employeeName) {
        sendTextToElement(employeeNameField, employeeName);
    }

    public void selectFromDropDownStatus(String status) {
       waitAndClick(statusField);
        //selectByVisibleTextFromDropDown(statusField, status);
    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
    }

    public String getInResultListText() {
        return getTextFromElement(userInResultList);
    }

    public void clickOnCheckbox()
    {
        clickOnElement(checkbox);
    }
    public void clickOnDeleteButton()
    {
        clickOnElement(deleteButton);
    }
    public void clickOnYesDelete(){
        getTextFromElement(yesDelete);
    }
    public String successfullyDeletedText(){
        return getTextFromElement(successfullyDeleted);
    }

    public void employeeDetail(String username,String userRole,String employeeName,String status)
    {
        enterUsername(username);
        selectUserRoleFromDropDown(userRole);
        enterEmployeeName(employeeName);
        selectFromDropDownStatus(status);
    }
}

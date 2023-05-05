package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends BaseTest
{
    LoginPage loginPage = new LoginPage();
    AdminPage adminPage = new AdminPage();
    AddUserPage addUserPage = new AddUserPage();
    ViewSystemUsersPage viewSystemUserPage = new ViewSystemUsersPage();
    HomePage homePage = new HomePage();


        @Test
        public void adminShouldAddUserSuccessFully()
        {

            loginPage.lunchApplication();
            homePage.clickOnAdminTab();
            String expectedMessage = "System Users";
            String actualMessage = adminPage.systemUsersText();
            Assert.assertEquals(actualMessage, expectedMessage);
            adminPage.clickOnAddButton();
            verifyText(driver, By.xpath("//h6[normalize-space()='Add User']"), "Add User");
            addUserPage.selectFromDropDownUserRole();

            addUserPage.enterEmployeeName("James Bond");
            addUserPage.enterUsername("Prime");

            addUserPage.selectFromDropDownStatus();
            addUserPage.enterPassword("Prime12345*");
            addUserPage.confirmPassword("Prime12345*");
            addUserPage.clickOnSaveButton();

            verifyText(driver, By.linkText("Successfully Saved"), "Successfully Saved");

        }
        @Test
        public void searchTheUserCreatedAndVerifyIt()
        {

            loginPage.lunchApplication();
            homePage.clickOnAdminTab();
            String expectedMessage = "System Users";
            verifyText(driver, By.xpath("//h5[normalize-space()='System Users']"), "System Users");
            viewSystemUserPage.enterUsername("John.Smith");
            viewSystemUserPage.selectUserRoleFromDropDown("Admin");
            viewSystemUserPage.enterEmployeeName("John Smith");
            viewSystemUserPage.selectFromDropDownStatus("Enabled");
            viewSystemUserPage.clickOnSearchButton();
            verifyText(driver, By.xpath("//span[normalize-space()='(1) Record Found']"), "(1) Record Found");

        }
        @Test
        public void verifyThatAdminShouldDeleteTheUserSuccessFully () {
            loginPage.userName("Admin");
            loginPage.password("admin123");
            loginPage.clickLoginButton();
            homePage.clickOnAdminTab();
            String expectedMessage = "System Users";
            String actualMessage = viewSystemUserPage.systemUsersText();
            Assert.assertEquals(actualMessage, expectedMessage);
            viewSystemUserPage.employeeDetail("John.Smith","Admin","John Smith","Enabled");
            viewSystemUserPage.clickOnSearchButton();
            viewSystemUserPage.clickOnCheckbox();
            viewSystemUserPage.clickOnDeleteButton();
            viewSystemUserPage.clickOnYesDelete();
            String expectedMessage1 = "Successfully Deleted";
            String actualMessage1 = viewSystemUserPage.successfullyDeletedText();
            Assert.assertEquals(actualMessage1, expectedMessage1);
        }
        @Test
        public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound () {
            loginPage.userName("Admin");
            loginPage.password("admin123");
            loginPage.clickLoginButton();
            homePage.clickOnAdminTab();
            String expectedMessage = "System Users";
            String actualMessage = viewSystemUserPage.systemUsersText();
            Assert.assertEquals(actualMessage, expectedMessage);
            viewSystemUserPage.employeeDetail("Prime.Testing","Admin","Prime Testing","Disabled");
            viewSystemUserPage.clickOnSearchButton();
        }
    }

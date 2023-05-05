package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest
{

    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldLoginSuccessFully() {
        loginPage.userName("Admin");
        loginPage.password("admin123");
        loginPage.clickLoginButton();
        //Verify "Dashboard" Message
        String expectedMessage = "Dashboard";
        String actualTextMessage = getTextFromElement(By.xpath("//header/div[1]/div[1]/span[1]/h6[1]"));
        Assert.assertEquals(expectedMessage, actualTextMessage);

    }

    @Test
    public void verifyThatTheLogoDisplayOnLoginPage()
    {
        loginPage.lunchApplication();
        loginPage.verifyLogoDisplay();
    }

    @Test
    public void verifyUserShouldLogOutSuccessFully()
    {
        loginPage.lunchApplication();
        loginPage.clickOnUserProfile();
        loginPage.mouseHooverOnLogoutClick();

   }
}

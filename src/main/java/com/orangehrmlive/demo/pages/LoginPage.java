package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility
{

    By username = By.xpath("//input[@placeholder='Username']");
    By password = By.xpath("//input[@placeholder='Password']");
    By clickOnLogin = By.xpath("//button[@type='submit']");
    By verifyLogo = By.xpath("//img[@alt='client brand banner']");
    By clickOnUserProfile = By.cssSelector("div.oxd-layout div.oxd-layout-navigation header.oxd-topbar div.oxd-topbar-header div.oxd-topbar-header-userarea ul:nth-child(1) li.oxd-userdropdown span.oxd-userdropdown-tab > img.oxd-userdropdown-img");
    By mouseHooverClickLogout = By.xpath("//a[contains(text(),'Logout')]");







    //Enter username
    public void userName(String name) {
        sendTextToElement(username, name);
    }

    //Enter Password
    public void password(String pword) {
        sendTextToElement(password, pword);
    }

    // Click on Login Button
    public void clickLoginButton()
    {
        clickOnElement(clickOnLogin);
    }

   //
    public void lunchApplication()
    {
        sendTextToElement(username, "Admin");
        sendTextToElement(password, "admin123");
        clickOnElement(clickOnLogin);
    }

    //Verify Logo is Displayed
    public void verifyLogoDisplay()
    {
        verifyText(driver,verifyLogo,"/web/images/orangehrm-logo.png?1672659722816");
    }

    //Click on User Profile logo
    public void clickOnUserProfile()
    {
        clickOnElement(clickOnUserProfile);

    }

    //Mouse hover on "Logout" and click
    public void mouseHooverOnLogoutClick()
    {
        mouseHoverToElementAndClick(mouseHooverClickLogout);

    }

    //Verify the text "Login Panel" is displayed


}

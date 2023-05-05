package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility
{
    By dashboardText = By.xpath("//a[@class='oxd-main-menu-item active']");
    By userProfileLogo = By.xpath("//span[@class='oxd-userdropdown-tab']");
    By logout = By.xpath("//a[contains(text(),'Logout')]");
    public String getDashboardText() {
        return getTextFromElement(dashboardText);

    }

    public void clickOnUserProfileLogo(){
        clickOnElement(userProfileLogo);
    }

    public void mouseHooverOnLogoutAndClick(){
        mouseHoverToElementAndClick(logout);
    }
 }

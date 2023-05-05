package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility
{
    By adminButton = By.xpath("//li[1]//a[1]//span[1]");

    public void clickOnAdminTab()
    {
        clickOnElement(adminButton);
    }

}

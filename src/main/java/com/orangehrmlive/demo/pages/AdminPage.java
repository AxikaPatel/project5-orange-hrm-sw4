package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility
{
    By systemUsersText = By.xpath("//h5[normalize-space()='System Users']");
    By addButton = By.xpath("//button[normalize-space()='Add']");

    public String systemUsersText(){
        return getTextFromElement(systemUsersText);
    }
    public void clickOnAddButton(){
        clickOnElement(addButton);
    }


}

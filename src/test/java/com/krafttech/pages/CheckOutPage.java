package com.krafttech.pages;

import com.krafttech.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage{
    @FindBy(id = "first-name")
    public WebElement firsName;
    @FindBy(id = "last-name")
    public WebElement lastName;
    @FindBy(id = "postal-code")
    public WebElement zipPostalCode;
    @FindBy(id = "cancel")
    public WebElement cancelButton;
    @FindBy(id = "continue")
    public WebElement continueButton;

    public void fillTheForm(){
        firsName.sendKeys(ConfigurationReader.get("firstName"));
        lastName.sendKeys(ConfigurationReader.get("lastName"));
        zipPostalCode.sendKeys(ConfigurationReader.get("zipCode"));
    }
}

package com.krafttech.pages;

import com.krafttech.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
@FindBy(id = "user-name")
    public WebElement userNameLogin;
    @FindBy(id = "password")
    public WebElement passwordLogin;
    @FindBy(id = "login-button")
    public WebElement loginBox;

    public void loginOl(String userName,String password){
        userNameLogin.sendKeys(userName);
        passwordLogin.sendKeys(password);
        loginBox.click();
    }
}

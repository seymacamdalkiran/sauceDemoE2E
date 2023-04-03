package com.krafttech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class YourCardPage extends BasePage{
@FindBy(xpath = "//div[@class='inventory_item_name']")
    public List<WebElement> listOfProduct;
    @FindBy(id = "checkout")
    public WebElement checkOut;

}

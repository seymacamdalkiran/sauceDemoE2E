package com.krafttech.pages;

import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    public WebElement basketNumber;
    @FindBy(id = "shopping_cart_container")
    public WebElement basket;


    public String getPageTitle(String pageName){
        WebElement title = Driver.get().findElement(By.xpath("//span[text()='" + pageName + "']"));
        return title.getText();
    }
    public int getEditItemNumber(){
        String addedItem = basketNumber.getText();
        return Integer.parseInt(addedItem);
    }
    public void click(WebElement element){
        element.click();
    }
    public void clickExceptContinueButton(String name){
        Driver.get().findElement(By.xpath("//button[.='"+name+"']")).click();
    }
}

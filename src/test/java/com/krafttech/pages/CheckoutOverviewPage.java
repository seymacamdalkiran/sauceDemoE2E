package com.krafttech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutOverviewPage extends BasePage {
    @FindBy(xpath = "//div[@class='inventory_item_price']")
    public List<WebElement> prices;
    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    public WebElement totalPrice;
    @FindBy(id = "cancel")
    public WebElement cancel;
    @FindBy(id = "finish")
    public WebElement finish;
    @FindBy(xpath = "//h2[text()='Thank you for your order!']")
    public WebElement thanksMessage;

    public String totalPrices(){
        double total=0;
        for (int i = 0; i < prices.size(); i++) {
            System.out.println("prices.get(0).getText() = " + prices.get(i).getText().substring(1));
            total+=Double.valueOf(prices.get(i).getText().substring(1));
        }
        System.out.println("****************");
        System.out.println("total = " + total);
        System.out.println("****************");
        return String.valueOf(total);
    }
}

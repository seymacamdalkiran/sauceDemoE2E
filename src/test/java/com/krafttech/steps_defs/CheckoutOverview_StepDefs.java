package com.krafttech.steps_defs;

import com.krafttech.pages.CheckoutOverviewPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CheckoutOverview_StepDefs {
    CheckoutOverviewPage checkoutOverviewPage=new CheckoutOverviewPage();
    @Then("Assert the price of items")
    public void assert_the_price_of_items() {
        Assert.assertTrue(checkoutOverviewPage.totalPrice.getText().contains(checkoutOverviewPage.totalPrices()));
    }
    @Then("Click finish button")
    public void click_finish_button() {
        checkoutOverviewPage.finish.click();
    }
    @Then("Assert the success shopping message")
    public void assert_the_success_shopping_message() {
        Assert.assertEquals(checkoutOverviewPage.thanksMessage.getText(),"Thank you for your order!");
    }
}

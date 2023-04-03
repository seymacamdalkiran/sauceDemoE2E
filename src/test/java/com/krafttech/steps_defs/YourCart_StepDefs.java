package com.krafttech.steps_defs;

import com.krafttech.pages.YourCardPage;
import com.krafttech.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class YourCart_StepDefs {
YourCardPage yourCardPage=new YourCardPage();
    @Given("Navigate to Your cart page")
    public void navigate_to_Your_cart_page() {
        yourCardPage.basket.click();
    }
    @Then("Assert that the right items added to cart")
    public void assert_that_the_right_items_added_to_cart(List<String> productName) {
        List<String> expected=productName;
        List<String> actual= BrowserUtils.getElementsText(yourCardPage.listOfProduct);
        Assert.assertEquals(expected,actual);
    }
}

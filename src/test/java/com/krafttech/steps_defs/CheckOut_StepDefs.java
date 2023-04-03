package com.krafttech.steps_defs;

import com.krafttech.pages.CheckOutPage;
import com.krafttech.pages.YourCardPage;
import com.krafttech.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CheckOut_StepDefs {
    YourCardPage yourCardPage=new YourCardPage();
    CheckOutPage checkOutPage=new CheckOutPage();
    @Given("Go to checkout page")
    public void go_to_checkout_page() {
        yourCardPage.checkOut.click();
    }
    @Then("Fill the form")
    public void fill_the_form() {
        checkOutPage.fillTheForm();
    }
    @Then("Click continue button and go to the checkout overview page")
    public void click_continue_button_and_go_to_the_checkout_overview_page() {
        checkOutPage.continueButton.click();
    }
}

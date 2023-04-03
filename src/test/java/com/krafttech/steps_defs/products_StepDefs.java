package com.krafttech.steps_defs;

import com.krafttech.pages.ProductsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class products_StepDefs {
    ProductsPage productsPage=new ProductsPage();
    @Then("The user should be able to see page title: {string}")
    public void the_user_should_be_able_to_see_page_title(String title) {
        String actual = productsPage.getPageTitle(title);
        String expected=title;
        Assert.assertEquals(expected,actual);
    }
    @Given("The user should be able to sort items order type: {string}")
    public void the_user_should_be_able_to_sort_items_order_type(String string) {
        productsPage.sortItems(string);
    }
    @Given("The user should be able to add items to cart with item name: {string}")
    public void the_user_should_be_able_to_add_items_to_cart_with_item_name(String itemName) {
        productsPage.addItem(itemName);
    }
    @Then("The number on the basket icon should show the added item number")
    public void the_number_on_the_basket_icon_should_show_the_added_item_number() {
        int actual=productsPage.getEditItemNumber();
        int expected=Integer.parseInt(productsPage.basket.getText());
        Assert.assertEquals(actual,expected);
    }

}

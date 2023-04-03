Feature: Your Cart
  Background:
    Given The user is on the login page
    When The user type in valid credential: "standard_user" and "secret_sauce"
    Then The user should be able to see page title: "Products"
    Given The user should be able to sort items order type: "Price (high to low)"
    And The user should be able to add items to cart with item name: "Sauce Labs Backpack"
    And The user should be able to add items to cart with item name: "Sauce Labs Bolt T-Shirt"
    Then The number on the basket icon should show the added item number

    Scenario: Your Cart
    Given Navigate to Your cart page
    Then The user should be able to see page title: "Your Cart"
    Then Assert that the right items added to cart
    |Sauce Labs Backpack|
    |Sauce Labs Bolt T-Shirt|
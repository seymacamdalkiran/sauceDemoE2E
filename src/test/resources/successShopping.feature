Feature: Success Shopping Feature

  Background:
    Given The user is on the login page
    When The user type in valid credential: "standard_user" and "secret_sauce"
    Then The user should be able to see page title: "Products"


  Scenario: Positive success Shopping E2E Test
    Given The user should be able to sort items order type: "Price (high to low)"
    And The user should be able to add items to cart with item name: "Sauce Labs Backpack"
    And The user should be able to add items to cart with item name: "Sauce Labs Bolt T-Shirt"
    Then The number on the basket icon should show the added item number

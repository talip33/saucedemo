@wip
  Feature: Purchase E2E test

    Background:
      Given The user is on the login page
      When The user enters "standard_user" and "secret_sauce" credentials

      Scenario: Sauce Purchase
        When The user should be able to sort the product "Price (high to low)"
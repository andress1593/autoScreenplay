# Autor: Andrés Castellanos

@stories
Feature: Register
  As a user, I want to access the Product Store page to buy technological devices

  @register
  Scenario: User register
    Given that Andres wants to register on the Product Store page
    When he finds a registration form where he must fill out the information
      | username   | password |
      | camilo3254 | 1234*    |
    Then he can log in the page

  @login
  Scenario: Log in Product Store
    Given that Andres wants to log in to the Product Store Page
    When he enters his credentials in the login form
      | username   | password |
      | andress1593 | 1234*   |
    Then he can navigate with his account

  @purchase
  Scenario: make a purchase
    Given that Andres wants to buy products from Product Store
    When he selects a category and a product and adds them to the cart to complete the purchase
    Then he finalizes the purchase and gets the product
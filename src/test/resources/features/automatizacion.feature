# Autor: Andrés Castellanos

@stories
Feature: Register
  As a user, I want to access the Product Store page to buy technological devices

  @register
  Scenario: User register
    Given that Andres wants to register on the Product Store page
    When he finds a registration form where he must fill out the information
      | username  | password |
      | HGFJT1234 | 1234*    |
    Then he can log in the page

  @login
  Scenario: Log in Product Store
    Given that Andres wants to log in to the Product Store Page
    When he enters his credentials in the login form
      | username  | password |
      | HGFJT1234 | 1234*    |
    Then he can navigate with his account

  @purchase
  Scenario: make a purchase
    Given that Andres wants to buy products from Product Store
    When he selects a category and a product and adds them to the cart to complete the purchase
      | category | product     | name    | country  | city     | creditCard     | month | year | username    | password |
      | Laptops  | Dell i7 8gb | Mariana | Colombia | Medellin | 42452566572324 | 10    | 2000 | andress1593 | 1234*    |
    Then he finalizes the purchase and gets the product
Feature: Customers
  Background: Common steps for all scenarios
    Given User Launch Chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User Enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on login
    Then User can see Dashboard
    When User click on Customers Menu
    And Click on Customers Menu Item

  Scenario: Add new Customer
    And Click on Add new Button
    Then User can view Add new Customer page
    When User enter Customer info
    And click on save button
    Then User can view confirmation message "The new customer has been added successfully."
    And Close browser

  Scenario: Search customer by using emailID
    And Enter customer email
    When Click on Search button
    Then User should found email "aa123@gmail.com" in the search table
    And Close browser

  Scenario: Search customer by Name
    And Enter customer First name
    And Enter customer Last name
    When Click on Search button
    Then User should found Name in the search table
    And Close browser
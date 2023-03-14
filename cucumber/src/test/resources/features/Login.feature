Feature: Login
@sanity
  Scenario: Successful login with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User Enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on log out link
    Then Page title Should be "Your store. Login
    And Close browser
@regression
  Scenario Outline: Successful login with Valid Credentials and Invalid
    Given User Launch Chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User Enters Email as <Email> and Password as <Password>
    And Click on login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on log out link
    Then Page title Should be "Your store. Login
    And Close browser
    Examples:
      | Email                 | Password    |
      | "admin@yourstore.com" | "admin"     |
      | "admin@yourstrre.com" | "admi2"     |
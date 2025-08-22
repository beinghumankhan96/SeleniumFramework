Feature: Login functionality

#  Background:
#    Given launch the "chrome" browser

  Scenario: Successful login with valid credentials
    #Given launch the "chrome" browser
    Given user with url "https://homestores18india.in/account/login" should navigate to the respective page
    And validate the given element "Login" present with given xpath "//h1[@class='m-zero h2' and contains(text(),'Login')]"
    When user enters valid "jobova1861@blaxion.com" and "Qwerty"
    And click login button
    Then user should be redirected to the dashboard


  Scenario: Verify Headphone dropdown
    Given click on Headphones tab
    When I click on Wireless and bluetooth headphone sub-menu
    Then user should be redirected to the Wireless and bluetooth headphones section

  Scenario: Validate About us page
    Given user with url "https://homestores18india.in/pages/about-us" should navigate to the respective page
    And validate the given element "About Us" present with given xpath "(//*[text()='About us'])[3]"




#  Scenario Outline: Go to home page
#    Given user with url "<url1>" should navigate to the respective page
#    Examples:
#      | url1 |
#      | https://homestores18india.in/account/login |
#      | https://homeshop18.in/                     |
#      | https://www.flipkart.com/                  |

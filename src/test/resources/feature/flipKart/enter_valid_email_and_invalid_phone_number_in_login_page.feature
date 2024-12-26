Feature: Enter valid email and navigate to opt page page

  Background:
    Given The user is on flipKart home page
    When I double click on login button

  @navigate_to_opt_page
  Scenario Outline: Login with valid email and navigate to opt page
    Then The user is  on flipKart login page
    And  I enter valid email address "<inputEmail>"
    When I click on RequestOTP button
#    Then I should see the OTP
#    Then an error message should be displayed
    Examples:
      | inputEmail       |
      | hassan@gmail.com |

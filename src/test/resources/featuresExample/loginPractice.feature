
Feature: Login functionality
#
  Background:
    Given The user is on homePage
    And I click on log in

  @login
  Scenario: log-in with valid username and password
    And I enter email "hassan@gmail.com"
    And I enter password1
    And I click on login button
    Then user must successfully login to the webPage

  @login_with_valid
  Scenario Outline: log-in with valid username and password
    And I enter email "<inputEmail>"
    And I enter password "<inputPass>"
    And I click on login button
    Then user must successfully login to the webPage
    Then I click on logout
    Examples:
      | inputEmail       | inputPass      |
      | hassan@gmail.com |Test@selenium |

  @login_with_invalid
  Scenario Outline: log-in with invalid username and password
    And I enter email "<inputEmail>"
    And I enter password "<inputPass>"
    And I click on login button
    Then verify login
    Examples:
      | inputEmail       | inputPass      |
      | hassan1@gmail.com |Test1@selenium |
      | hassan2@gmail.com |Test2@selenium |


  @login_with_Data_table
  Scenario: log-in with Data table
    And I enter email and password4
    |hassan@gmail.com  |Test@selenium |
    And I click on login button
    Then user must successfully login to the webPage
    Then I click on logout

  @login_with_Data_table_with_header
  Scenario: log-in with Data table with header
    And I enter email and password5
      | user             | pass          |
      | hassan@gmail.com | Test@selenium |
    And I click on login button
    Then user must successfully login to the webPage
    Then I click on logout






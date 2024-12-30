Feature: Verify Flight Search Functionality

  Background:
    Given The user is on flipKart home page

  @Flight_Search
  Scenario Outline: Search results are displayed for a valid product search
    When I click on Flights bookings
    Then I should be navigated to flight search page
    And I select departure date "<departure date>"
    And I select return date "<return date>"
    And I select the departure city "<departure city>"
    And I select the destination city "<destination city>"
    Then I click the Search flight button
    Then I should be navigated to flight page



    Examples:
      | departure date   |   return date | departure city | destination city|
      | March 2025,13 |  April 2025,20 |  BOM            | BKK              |
      | February 2025,25 |  May 2025,10 |  HYD            | KUL              |


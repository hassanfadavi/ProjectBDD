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
#    Then I click the Search button.
#    Then the system should display available flights matching the departure "<departure city>"
#    And the system should display available flights matching the destination "<destination city>"


    Examples:
      | departure date   |   return date | departure city | destination city|
      | February 2025,10 |  April 2025,20 |  BOM            | BKK              |

#
#      | departure date   | departure city | destination city|
#      | February 2025,10 | BOM            | BKK              |
#

#      | departure city | destination city | departure date | return date |
#      | phone          | Mobiles          |  departure date | Mobiles     |
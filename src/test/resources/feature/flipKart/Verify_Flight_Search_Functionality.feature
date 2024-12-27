Feature: Verify Flight Search Functionality

  Background:
    Given The user is on flipKart home page

  @Flight_Search
  Scenario Outline: Search results are displayed for a valid product search
    When I click on Flights bookings
    Then I should be navigated to flight search page
    And I select the departure city "<departure city>"
    And I select the destination city "<destination city>"
    And I select departure date "<departure date>"
#    And I select return date "<return date>"
#    Then I click the Search button.
#    Then the system should display available flights matching the departure "<departure city>"
#    And the system should display available flights matching the destination "<destination city>"


    Examples:
      | departure city | destination city | departure date |
      | BOM            | BKK              | departure date |

#      | departure city | destination city | departure date | return date |
#      | phone          | Mobiles          |  departure date | Mobiles     |
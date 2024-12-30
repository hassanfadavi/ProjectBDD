Feature: Verify_Discount_Filter_Functionality

  Background:
    Given The user is on flipKart home page


  @Discount_filter
  Scenario Outline: Searchs results are displayed for a valid product search





    Examples:
      | departure date   |   return date | departure city | destination city|
      | March 2025,13 |  April 2025,20 |  BOM            | BKK              |


Feature: Verify_Discount_Filter_Functionality

  Background:
    Given The user is on flipKart home page


  @Discount_filter
  Scenario Outline: Search results are displayed for a valid product search
    When I hover over the Fashion category in the navigation bar
    And I navigate to Men_Footwear and then Men’s Sports Shoes
    Then I will be navigated to product's detail page
    Then I hover over the Discount filter on the left-hand side of the page
    When I select a discount filter "<Discount Percentage>"
#    Then All products in the listing should have a valid discount of percentages or more "<Discount Percentage>"

    Examples:
      | Discount Percentage |
      | 30% or more         |
      | 60% or more         |
#      | 40% or more         |
#      | 50% or more         |
#      | 70% or more         |

Feature: Verify Product Search Functionality

  Background:
    Given The user is on flipKart home page

  @Product_Search
  Scenario Outline: Search results are displayed for a valid product search
    When I enter product_name in search bar "<product_name>"
    And I click the Search button
    Then I should be navigated to search page
    Then results displayed should be related to the selected category "<categories>"

    Examples:
      | product_name | categories  |
      | phone        | Mobiles     |
      | tv           | Televisions |





#    Examples:
#      | product_name | categories |
#      | phone        | Mobiles |
##      | shoes       | Footwear |
##      | pans        | Cookware |

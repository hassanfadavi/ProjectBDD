Feature:  Verify Maximum and Minimum Price Range Filter Works

  Background:
    Given The user is on flipKart home page

  @Price_Range
  Scenario Outline: Price Range Filtering on Search Results Page
    When I enter productname in search bar "<product_name>"
    And I click Search button
    Then I must be navigated to search page
    When the user sets the minimum price filter to "<min_price>"
    And sets the maximum price filter to "<max_price>"
    When the user selects the Price Low to High sorting option
    Then the products displayed should have prices greater than or equal to "<min_price>"
    When the user selects the Price High to Low  sorting option
    Then the products displayed should have prices less than or equal to "<max_price>"
#    And no product outside this price range should appear in the filtered results



    Examples:
      | product_name    | min_price |max_price |
      | Washing Machine | 15000     |25000 |




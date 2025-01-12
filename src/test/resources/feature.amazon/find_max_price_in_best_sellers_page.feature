Feature:  Find the maximum price for Best Sellers in a specific department

  Background:
    Given The user is on amazon home page

  @max_price_in_best_seller_pag
  Scenario Outline:   User clicks on Best Sellers, selects a department, and finds the maximum price
    When the user clicks on Best sellers link
    Then the user will be navigated to Amazon Best seller
    And the user selects the specific department from the left side bar "<department>"
    And the user will be navigated to Best Sellers in specific department "<department>"
    And the user extracts the prices of all best-selling items in two pages
    And the user clicks on the product corresponding to the maximum price

    Examples:
      | department                |
      | Baby                      |
#      | Clothing, Shoes & Jewelry |
#      | Software                  |


Feature:  Verify Add to Cart Functionality

  Background:
    Given The user is on flipKart home page

  @add_product_to_cart
  Scenario Outline:  A product is successfully added to the cart
    When I enter product name in the search bar "<product_name>"
    And I will click the Search button
    Then I would be navigated to search page
    When I will click on my product
    Then I should be navigated to product's detail page
    When I click the Add to Cart button
    Then the product should be added to the cart
    And the cart count should update accordingly


    Examples:
      | product_name |
      | zippyque Headphone design winter   |


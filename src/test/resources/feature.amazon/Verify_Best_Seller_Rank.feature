Feature: Search and Verify Best Seller Rank on Amazon

  @Best_Seller_Rank
  Scenario Outline: user should be able to verify best seller rank
    Given The user is on amazon home page
    When the user hovers over the All dropdown menu
    And the user selects the department from the department options "<department>"
    And the user input product in search bar "<product>"
    And the user hit Enter key
    Then I should be navigated to product page,results for product "<product>"
#    And I select the brands name from brands list "<brand>"
    Then the user identifies the Best Seller product from the search results
    And the user clicks on the first Best Seller product
#    Then the product details page should display Best Seller rank as #1

    Examples:
      | department  | product      |
      | Electronics | Apple AirTag |
      | Appliances  | Amazon Fire TV   |


#  Amazon Fire TV


#      | Appliances  | dishwasher   |


#      | Baby       |
#      | Smart Home |


#      | department | product |
#      | Appliances | watch   |
#      | Baby       | watch   |
#      | Smart Home | watch   |









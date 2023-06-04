Feature: login to amazon account
  Scenario Outline: login to amazon account
    Given I am on the amazon homepage
    
    When I click on the sign in button
    And I enter the "<User_Name>" in user name input field
    And I enter the "<password>" in password input field
    
    And I click on the sign in button
    Then I can successfully login to my amazon account


    Examples: 
      | User_Name       |  password  |
      | sagor@gmail.com |  1234556   |
      

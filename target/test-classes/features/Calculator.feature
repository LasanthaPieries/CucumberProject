Feature: Calculator Functions

  Background: 
    Given I have a calculator

	@sanity
  Scenario: To Add two numbers
    When I add 4 and 5
    Then I should get the result as 9

  Scenario Outline: This sceanrio is to add 2 numbers in a table
    When I add number1 as <num1> and number2 as <num2>
    Then I should get the answer in <result>

    Examples: 
      | num1 | num2 | result |
      |   10 |   20 |     30 |
      |   30 |   40 |     70 |
      |   50 |   40 |     90 |

  Scenario: To Add more than 2 numbers
    When I add below numbers
      | 3 |
      | 2 |
      | 5 |
      | 4 |
      | 3 |
    Then I should compute the result as 17

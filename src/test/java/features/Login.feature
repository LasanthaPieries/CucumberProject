Feature: Login Feature Scenario

  Background: 
    Given I have launched the application
    And I click on the Login Link

  Scenario: This scenario is to define the login happy path
    When I enter the correct username and password
    And I click on the Login Button
    Then I should land on the home page

  Scenario: This scenario is to define the failure path
    When I enter the incorrect username and password
    And I click on the Login Button
    Then I should get the error message "The email or password you have entered is invalid."

  Scenario: This sceanrio is to define the failure path
    When I enter the username as "Abc@xyz.com" and password as "Abc@12344"
    And I click on the Login Button
    Then I should get the error message "The email or password you have entered is invalid."

  Scenario Outline: This sceanrio is to define the failure path
    When I enter the username as "<UserName>" and password as "<Password>"
    And I click on the Login Button
    Then I should get the error message "The email or password you have entered is invalid."

    Examples: 
      | UserName    | Password |
      | Abc@xyz.com | Abc@1234 |
      | Pqr@xyz.com | Ert@1234 |

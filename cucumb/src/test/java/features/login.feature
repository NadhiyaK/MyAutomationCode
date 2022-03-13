Feature: Application Login

  Scenario: Home page default login
    Given user is on login page
    When user provide username "test1" and password "password"
    And clicking login button
    Then home page should be displayed "true"

  Scenario: Home page default login
    Given user is on login page
    When user provide username "test2" and password "password"
    And clicking login button
    Then home page should be displayed "true"
    
 Scenario: Home page default login
    Given user is on login page
    When user provide username "test3" and password "password"
    And clicking login button
    Then home page should be displayed "false"
    
    
    
    
Feature: Login page validation

  Scenario Outline: Positive test validation login
    Given Initialize the browser with chrome
    And Navigate to "https://rahulshettyacademy.com/" site
    And click on the sign in page
    When user enteres <username> and <password>
    Then home page displayed "true"
    And close the browser

    Examples: 
      | username            | password   |
      | nadhima28@gmail.com | testing123 |
      | test99@gmail.com    |     123456 |

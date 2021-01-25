Feature: Launch the Application

  Scenario: Open Chrome Aplication and Launch Sauce Demo
    Given Url for Sauce Demo Application
    When Url is validated
    And Enter Username
    And Enter Password
    Then Click Login
		Then Close the Application
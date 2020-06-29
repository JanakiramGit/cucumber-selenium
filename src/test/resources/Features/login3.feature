@testadduser
Feature: Feature to test login functionality

# @testadduser
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
    Given user is on home page
    When user clicks add a new student button
    And enters user name 
    And clicks add user button   
    Then new user is listed in the list

#	parametrizing the scenario using outline
#  @tag2
#  Scenario Outline: Check login is successful with valid credentials
#   Given user is on login page
#   When user enters <username> and <password>
#   And clicks on login button
#   Then user is navigated to the home page

#   Examples: 
#     | username                     | password |
#     | janakiram.sampalli@gmail.com | siri     |

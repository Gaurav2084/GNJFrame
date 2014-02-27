Feature: Login to DMI
Scenario: Login Test
Given I am on the login screen and has no content
When I login using user name and password 
Then I will be taken to DMI application
 

Feature: AutomationPractice page test

Scenario: login to the automation page
Given I am on the loginPage
When I get the title of the page
Then I valdate the title of the page

Scenario: Validate forget link is displayed 
Given I am on the loginPage
Then Validate if forget password link is displayed

@login
Scenario Outline: Login with credentials
Given I am on the loginPage
When I enter Username '<username>'
And I enter Password '<password>'
And I click on the Login button


Examples:
|username|password|
|sonal04@gmail.com|abc@123|
|admin@gmail.com|admin@123|
|emp@gmail.com|emp@123|

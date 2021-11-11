
Feature: Contact Us page Test


Scenario Outline: ContactUs Page
Given I am contact us Page
When I fill the form from sheet '<sheetName>' and rowNumber <RowNumber>
And user click on send button

Examples:
|sheetName|RowNumber|
|Sheet1|2|
|Sheet1|3|


Feature: from flight menu insert some values

@done3
Scenario: click on flight menu and insert options to search
Given user on home page
When title of page find flight
Then click on oneway
Then click on businessclass


Scenario Outline: click on flight menu and insert option to search
Given on home page
When <username> is enter
And <password> is enter
Then login should be successful

Examples:
  |username|password|
  |vaibhavsh|welcome1|
  |reguser|welcome1|


Feature: Calculator

Scenario: Add funtion

Given user enter 15 and 7
And select "Add"
When click on button "Calculate"
Then result should be 22

Scenario: Multiply funtion

Given user enter 5 and 7
And select "Multi"
When click on button "Calculate"
Then result should be 35
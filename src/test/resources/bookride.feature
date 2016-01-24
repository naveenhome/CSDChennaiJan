Feature: Book A Ride
description
Scenario: Valid posting without data
Given employee enter all valid data
When Click on "Submit"
Then System display "Posting was successful"

Scenario: Valid posting with data
Given employee enter name as "Naveen" Phone as "9810547500", email as "naveen.singh@leanpitch.com" and origin is "Office" and destination is "Adyar" and time is "5:30pm"
When Click on "Submit"
Then System display "Posting was successful"

Scenario: InValid posting with data
Given employee enter name as "" Phone as "9810547500", email as "naveen.singh@leanpitch.com" and origin is "Office" and destination is "Adyar" and time is "5:30pm"
When Click on "Submit"
Then System display "Posting failed"

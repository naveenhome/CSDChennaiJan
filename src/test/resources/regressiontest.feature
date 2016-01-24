Feature: Booking ride

  Scenario Outline: Regression test for booking ride
    Given user enter <name> and <email>
    When click on <button>
    Then system display <message>

    Examples: 
      | name     | email         | button   | message   |
      | "Naveen" | "abc@xyz.com" | "Submit" | "Success" |
      | " "      | "abc@xyz.com" | "Submit" | "fail"    |
      | "Naveen" | "abc@com"     | "Submit" | "fail"    |

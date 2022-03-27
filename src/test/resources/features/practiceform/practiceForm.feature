Feature: Automation testing using screenplay pattern
  As an automation tester
  I need to practice automation testing using screenplay pattern
  To learn about serenity BDD framework

  Scenario Outline: fill a student registration form using mandatory fields
    Given The student is located on the landing page of Tools AQ
    When he browse to registration form
    And he has filled it and submitted
    |firstName  |<firstName>  |
    |lastName   |<lastName>   |
    |gender     |<gender>     |
    |mobile     |<mobile>     |
    Then the student will see a registration information
    Examples:
    |firstName|lastName   |gender |mobile    |
    |Juan     |Maya       |Male   |3012905481|
    #|Jorge    |Piedrahita |Male   |3022860601|
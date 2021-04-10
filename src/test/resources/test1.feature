Feature: Printing family details based ont he requirement

Background:
  Given I create family entity
  And I add name1
  And I add name2
  And I add name3

Scenario: Print only name1
  Then I print name1

Scenario: Print only name2
  Then I print name2

Scenario: Print only name3
  Then I print name3

Scenario: Print whole object value
  Then I print name3
  And print whole object
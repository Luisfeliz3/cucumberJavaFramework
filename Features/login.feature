#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
 
Feature: Payment Center Test
  This wills run basic Payments tests

  Scenario: Make A Payment Scenarios
    Given I have logged in 
    Then I click on the make a payment button
    Then I should see the pay your bill container
    Then I click on <payment> radio button
    Then I enter <payment> <amount>
    Then I click on pay now button
    Then I should see alert <payment> <message>
 		
 
    Examples:
     | payment                   | amount    | message                       |
     | Minimun Payment Due       | "40.00"   | "Thank You For Your Payment!" |
     | Pay Statement Balance     | "1000.85" | "Thank You For Your Payment!" |
     | Pay Total Balance         | "8834.55" | "You can only Pay the Full Amount, If you want to make a custom payment please choose the 'Pay Other Amount' option" |
     #| Pay Other Amount          | "500.00"  | "Please pay up to the Total Amount only!" |
 
 
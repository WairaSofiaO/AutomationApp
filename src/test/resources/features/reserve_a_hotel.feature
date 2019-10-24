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

Feature: Reserve a hotel in Trivago
  I as a Trivago user
  I want to reserve a hotel
  I want satellite tv in the room and a punctuation higher 7.5 or good
  To verify the condition of the hotel (excellent, very good or good).

  Scenario Outline: Reserve the cheapest hotel
    Given the actor looks for <CITY> and the date on which her wants to stay
    #And the actor wants her room to have satellite television inside its
    And the actor wants her room with amenities and a higher score range of Good
    When the actor wants to choose the cheapest room
    Then To verify the condition of the hotel: excellent, very good or good
    
	Examples: 
	| CITY			|
	| Medellin	|


#  @tag2
#  Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
 #   When I check for the <value> in step
#    Then I verify the <status> in step

   # Examples: 
  #    | name  | value | status  |
 #     | name1 |     5 | success |
#      | name2 |     7 | Fail    |


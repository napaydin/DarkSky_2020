@web
Feature: Verify darksky
  Background:
    Given I am on Darksky Home Page

    @temptimeline-1
    Scenario: Verify timeline is displayed in correct format
      When I entered Fillmore Street, San Francisco, CA in search Box
      Then I verify timeline is displayed with two hours incremented

      @temptimeline-2
      Scenario: Verify individual day temp timeline
        When I expand todays' timeline
        Then I verify lowest and highest temp is displayed correctly
Feature: This feature tests vicroads First Page

Background: User visits website
Given User is logged in to vicroads website

  Scenario: Scenario tests one day price for pass of passenger vehicle
    Given User selects passenger vehicle
    And User selects passenger vehicle type
    And User fills Address
    And User fills the Permit Date
    And User fills the Permit Duration
    And User clicks calculator - Submit Order
    Then Pass amount is calculated and User is taken to next pages
    
    Scenario: Scenario tests one day price for pass of Goods carrying vehicle
    Given User1 selects Goods carrying vehicle
    And User1 selects carrying vehicle type
    And User1 fills Address
    And User1 fills the Permit Date
    And User1 fills the Permit Duration
    And User1 clicks calculator - Submit Order
    Then Pass amount is calculated and User1 is taken to next pages
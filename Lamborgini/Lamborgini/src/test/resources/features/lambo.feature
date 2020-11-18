@car
Feature: Buy a lambo

  Background: You navigate to the base page
    Given you are on website

  Scenario: Verify Basic lambo price
    When you select "model 718
    And click on 718 model S and save the price
    Then then price should be base price plus Delivery plus Processing and Handling


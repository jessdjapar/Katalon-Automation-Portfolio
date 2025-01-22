@Checkbox
Feature: Verifying checkboxes

  @Checkbox 
  Scenario: User check the Home checkbox
    Given User is in the Checkbox page
    When User click the Home checkbox
    Then Verify the checkbox is checked
  
  #Demonstrate looping through all checkboxes  
  @Checkbox 
  Scenario: User check and uncheck all checkboxes
    Given User is in the Checkbox page
    When User click expand button in the Checkbox page
    Then User check and uncheck all checkboxes

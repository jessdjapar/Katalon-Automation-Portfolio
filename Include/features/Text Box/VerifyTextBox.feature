@Textbox
Feature: Verify the Textboxes in the Textbox page

  @Textbox @Positive
  Scenario Outline: User input all texboxes with valid data
    Given User is in the Textbox page
    When User input Full Name Textbox <FullName>
    And User input Email Textbox <Email>
    And User input Current Address Textbox <currentAddress>
    And User input Permanent Address Textbox <permanentAddress>
    And User click the Submit button in Textbox page
    Then Verify all inputs will be displayed correctly in the Textbox page <FullName> <Email> <currentAddress> <permanentAddress>

    Examples: 
      | FullName    | Email           | currentAddress | permanentAddress |
      | FullName001 | abc@yopmail.com | Address1       | Address2         |

  @Textbox @Negative
  Scenario Outline: User input invalid email
    Given User is in the Textbox page
    When User input Full Name Textbox <FullName>
    And User input Email Textbox <InvalidEmail>
    And User input Current Address Textbox <currentAddress>
    And User input Permanent Address Textbox <permanentAddress>
    And User click the Submit button in Textbox page
    Then Verify system validated the invalid email

    Examples: 
      | FullName    | InvalidEmail | currentAddress | permanentAddress |
      | FullName001 | abc@yopmail  | Address1       | Address2         |

  @Textbox @Negative
  Scenario Outline: User all textboxes accept the Full Name
    Given User is in the Textbox page
    When User input Full Name Textbox <FullName>
    And User input Email Textbox <Email>
    And User input Current Address Textbox <currentAddress>
    And User input Permanent Address Textbox <permanentAddress>
    And User click the Submit button in Textbox page
    Then Verify all inputs will be displayed correctly in the Textbox page <FullName> <Email> <currentAddress> <permanentAddress>

    Examples: 
      | FullName | Email           | currentAddress | permanentAddress |
      | -        | abc@yopmail.com | Address1       | Address2         |

  @Textbox @Negative
  Scenario Outline: User all textboxes accept the Email
    Given User is in the Textbox page
    When User input Full Name Textbox <FullName>
    And User input Email Textbox <Email>
    And User input Current Address Textbox <currentAddress>
    And User input Permanent Address Textbox <permanentAddress>
    And User click the Submit button in Textbox page
    Then Verify all inputs will be displayed correctly in the Textbox page <FullName> <Email> <currentAddress> <permanentAddress>

    Examples: 
      | FullName    | Email | currentAddress | permanentAddress |
      | FullName001 | -     | Address1       | Address2         |

  @Textbox @Negative
  Scenario Outline: User all textboxes accept the Current Address
    Given User is in the Textbox page
    When User input Full Name Textbox <FullName>
    And User input Email Textbox <Email>
    And User input Current Address Textbox <currentAddress>
    And User input Permanent Address Textbox <permanentAddress>
    And User click the Submit button in Textbox page
    Then Verify all inputs will be displayed correctly in the Textbox page <FullName> <Email> <currentAddress> <permanentAddress>

    Examples: 
      | FullName    | Email           | currentAddress | permanentAddress |
      | FullName001 | abc@yopmail.com | -              | Address2         |

  @Textbox @Negative
  Scenario Outline: User all textboxes accept the Permanent Address
    Given User is in the Textbox page
    When User input Full Name Textbox <FullName>
    And User input Email Textbox <Email>
    And User input Current Address Textbox <currentAddress>
    And User input Permanent Address Textbox <permanentAddress>
    And User click the Submit button in Textbox page
    Then Verify all inputs will be displayed correctly in the Textbox page <FullName> <Email> <currentAddress> <permanentAddress>

    Examples: 
      | FullName    | Email           | currentAddress | permanentAddress |
      | FullName001 | abc@yopmail.com | Address1       | -                |

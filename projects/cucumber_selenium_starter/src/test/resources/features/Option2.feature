Feature: An agent or representative of someone who pays for care directly
  As a agent or representative who pays for their care
  directly I should be able to provide my details and register
  for the scheme.

  Scenario: Users with a UK address can register for the scheme

    Given I am on the social care compliance homepage

    When I choose the "An agent or representative of someone who pays for care directly" option

    And I enter my name as "name"

    And I choose the "Yes" option

    And I enter my address as
      | Field          | Value           |
      | addressLine1   | 123 Fake Street |
      | addressLine2   | Fake Town       |
      | postcode       | NE98 1ZZ        |

    Then I choose the "Continue" option

    And I enter my phone number as 12345

    And I choose the "No" option for email

    And I choose the "No" option for UTR

    And I choose the "No" option for PAYE

    Then I enter my name as "name"

    Then I choose the "Yes" option

    And I enter my address as
      | Field          | Value           |
      | addressLine1   | 123 Real Street |
      | addressLine2   | Real Town       |
      | postcode       | NE98 1ZY        |

    And I choose the "Continue" option

    Then I enter my phone number as 12345

    And I choose the "No" option for email

    And I will be shown my answers
      | Label                           | Answer                             |
      | Which option best describes you | An agent or representative of someone who pays for care directly |


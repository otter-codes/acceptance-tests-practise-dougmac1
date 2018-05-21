Feature: An agent or representative of a company that employs social care workers
  As an agent or representative of a company that employs
  social care workers I should be able to provide my details
  and register for the scheme

  Scenario: Users with a UK address can register for the scheme

    Given I am on the social care compliance homepage

    When I choose the "An agent or representative of a company that employs social care workers" option

    And I enter the company as "companyName"

    And I choose the "Yes" option

    And I enter my address as
      | Field          | Value           |
      | addressLine1   | 123 Dev Street  |
      | addressLine2   | Dev Town        |
      | postcode       | NE98 1ZW        |

    And I choose the "No" option for UTR

    And I choose the "No" option for PAYE

    And I enter my name as "name"

    And I choose the "Yes" option

    And I enter my address as
      | Field          | Value           |
      | addressLine1   | 123 Bar Street  |
      | addressLine2   | Pub Town        |
      | postcode       | NE98 1ZV        |

    Then I enter my phone number as 12345

    And I choose the "No" option for email
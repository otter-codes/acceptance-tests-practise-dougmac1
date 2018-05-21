Feature: A company that employs social care workers
  As a company that employs social care workers I should
  be able to provide my details and register for the scheme

  Scenario: Users with a UK address can register for the scheme

    Given I am on the social care compliance homepage

    When I choose the "A company that employs social care worker" option

    Then I choose the "Continue" option

    And I enter my name as "name"

    And I enter the company as "companyName"

    And I choose the "Yes" option

    And I enter my address as
      | Field          | Value           |
      | addressLine1   | 123 Not Street  |
      | addressLine2   | Not Town        |
      | postcode       | NE98 1ZX        |

    Then I enter my phone number as 12345

    And I choose the "No" option for email

    And I choose the "No" option for UTR

    And I choose the "No" option for PAYE

    And I will be shown my answers
      | Label                           | Answer                                    |
      | Which option best describes you | A company that employs social care worker |
      | Your name                       | name                                      |
      | Company Name                    | companyName                               |
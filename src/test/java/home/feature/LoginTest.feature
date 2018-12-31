Feature: Verify login functionality

  @IntegrationTest
  Scenario Outline: Login as a authenticated user
    Given user is  on homepage
    And user enters "<username>" and "<Password>"
    And user clicks on login button
    Then success message is displayed

    Examples: 
      | username | Password |
      | manoj    | manoj    |
      | kumar    | kumar    |
      | lodhi    | lodhi    |

Feature: LLaves

  @Login
  Scenario: Login on the website
    Given that enter the page 'http://localhost:8080/#/'
    When enter valid credentials
      | user | password |
      | Anni | 123      |
    Then the user will be logged in correctly
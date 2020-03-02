Feature: Hotel Booking

  Scenario: Login procuder
    Given User in login page
    When Enter the usernames and passwords
      | username             | password  |
      | admin@phptravels.com | demoadmin |
      | yuvara               | King      |
    And Click the login button
    Then User is on Home Page

Feature: RegisterFeature
  This feature deals with the register form of the site

  Scenario: Entering all the fields into the register form
    Given I enter the website
    When I launch the application
    And Enter the first name
    And Enter the last name
    And Enter the address
    And Enter the city
    And Enter the state
    And Enter the zip code
    And Enter the phone number
    And Enter the SSN
    And Enter the username
    And Enter the password
    And Enter the confirmation password
    And Enter click the register button
    Then I should see the account created

  Scenario: Entering all the fields but the phone # into the register form
    Given I enter the website
    When I launch the application
    And Enter the first name
    And Enter the last name
    And Enter the address
    And Enter the city
    And Enter the state
    And Enter the zip code
    And Enter the SSN
    And Enter the username
    And Enter the password
    And Enter the confirmation password
    And Enter click the register button
    Then I should see the account created

  Scenario: Entering all the fields but the City + State + ZipCode
    Given I enter the website
    When I launch the application
    And Enter the first name
    And Enter the last name
    And Enter the address
    And Enter the phone number
    And Enter the SSN
    And Enter the username
    And Enter the password
    And Enter the confirmation password
    And Enter click the register button
    Then I should see the account created

  Scenario: Entering only numbers instead of letters into the Last Name + First Name + City + State fields
    Given I enter the website
    When I launch the application
    And Enter the first name with numbers
    And Enter the last name with numbers
    And Enter the address
    And Enter the city with numbers
    And Enter the state with numbers
    And Enter the zip code
    And Enter the phone number
    And Enter the SSN
    And Enter the username
    And Enter the password
    And Enter the confirmation password
    And Enter click the register button
    Then I should see the account created

  Scenario: Entering an excessive number of characters for the username
    Given I enter the website
    When I launch the application
    And Enter the first name
    And Enter the last name
    And Enter the address
    And Enter the city
    And Enter the state
    And Enter the zip code
    And Enter the phone number
    And Enter the SSN
    And Enter the username with an excessive number of characters
    And Enter the password
    And Enter the confirmation password
    And Enter click the register button
    Then I should see the account created
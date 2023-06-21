Feature: Feature to test Expedia functionality

  Scenario: Flight Booking Test
    Given browser is open
   	And click on Flights
    Then click on one way
    Then click on FROM
    When user enter location in serch field
    Then select the from location
    Then click on TO
    When user enter location into search field
    Then select the to location
    Then select departure date
    Then click on travellers&class
    Then select passengers
    And click on apply
    Then click on search
    Then click on ok got it
    Then click on view prices
    When click on first book now
    Then navigate to child window 
    Then click on Yes Secure my trip radio button
    Then click on add new adult    
     Then enter first name
     And enter last name
     And select gender
     And enter phone number
     And enter email
     Then click on continue
     Then click on confirm button in popup
     Then click on yes,please button
     Then click on contiue button 
     Then click on food continue button
     And click on continue anyway
     Then click on proceed to pay
     
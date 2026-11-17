Feature: place API's validation

@addPlace
  Scenario Outline: Validate if place is successfully added using AddPlace API
    Given Add Place Payload "<name>" "<language>" "<address>"
    When user calls "AddPlaceAPI" with "POST" Http Request
    Then the API call success with status code 200
    And "status" in response body is "OK"
    And  "scope" in response body is "APP"
    Then verify place_Id created maps to "<name>" using "GetPlaceAPI"

    Examples:
      | name      | language | address        |
      | telangana | telugu   | wgl test only  |
      | andra     | english  | nspt knpr test |


  @deletePlace
  Scenario: validate Delete place functionality working
    Given Delete place payload
    When user calls "DeletePlaceAPI" with "POST" Http Request
    Then  the API call success with status code 200
    Then "status" in response body is "OK"





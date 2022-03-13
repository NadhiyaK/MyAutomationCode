Feature: Get API Call

  Scenario: Get User details
    Given url baseUrl+'/public/v2/users'
    And path 30
    When method Get
    Then status 200
    * def actualresponse = response
    * print actualresponse
    * print actualresponse.name + " " + actualresponse.email
    * def name = actualresponse.name
    * def email = actualresponse.email
    * def urlname = baseUrl+'/public/v2/users'
    * match name == 'Manisha Banerjee'
    * match email == 'banerjee_manisha@balistreri.org'
    * print response.status
		* print urlname
		
		Scenario: Post User Details
		Given url baseUrl+'/public/v2/users'
		And 


Feature: Submit data to webdriveruniversity.com using contact us form

Scenario: Submit valid data via contact us form
	Given I access webdriveruniversity contact us form
	When I enter a valid firstname
	When I enter a valid Lastname
	|Woods |Mickel |Jackson|
	And I enter a valid email address
	And I enter comments
    |example comment one|example comment two|
    When I click on the submit button
    Then The information should successfully be submitted via the contact us form     
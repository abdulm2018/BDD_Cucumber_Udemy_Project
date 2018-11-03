Feature: Products page
Scenario Outline: Validate prmo code alert is visible when clicking on the special ofers link

	Given User navigates to "<url>" website  
	When User clicks on "<button>"
	Then User should be presented with a promo alert
	
	Examples:
	
	|                           url                                      |              button           |      
	| http://www.webdriveruniversity.com/Page-Object-Model/products.html |     #container-special-offers  | 
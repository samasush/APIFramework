Feature: HSBC APILatestForeignExchangeReferenceRates

@LatestForeignExchangeRates
Scenario: Validate the latest Foreign Exchange Rates API using GET API
	Given User sends the Http request to the ratesAPI server with valid Parameter
	When User hit the api with request and endpoint URL
	Then API return all "records" with "OK"
	
@LatestForeignExchangeRateswithSymbols
Scenario: validate the Latest Foreign Exchange Rates with Symbols using GET API
	Given User sends the Http request to the ratesAPI server with valid Parameter
	And User selects the 'Latest Foreign Exchange Rates with Symbols' Endpoint URL
	And User sets up the headers
	When User submits the 'GET' request
	Then Verify the expected StatusCode and StatusLine of the Response
	And Verify Status Value for 'Get Latest Foreign Exchange Rates with Symbols' Api
	And Verify the expected Status Message from 'Latest Foreign Exchange Rates with Symbols' API response	 
	
@SpecificdateForeignExchangerates
Scenario: validate the Specific date Foreign Exchange rates using GET API
	Given User sends the Http request to the ratesAPI server with valid Parameter
	And User selects the 'Specific date Foreign Exchange rates' Endpoint URL
	And User sets up the headers
	When User submits the 'GET' request
	Then Verify the expected StatusCode and StatusLine of the Response
	And Verify the expected Status Message from 'Specific date Foreign Exchange rates' API response	 
	
@LatestForeignExchangeRateswithBase
Scenario: validate the Latest Foreign Exchange Rates with Base using GET API
	Given User sends the Http request to the ratesAPI server with valid Parameter
	And User selects the 'api/latest' Endpoint URL
	And User sets up the headers
	When User submits the 'GET' request
	Then Verify the expected StatusCode and StatusLine of the Response
	And Verify the expected Status Message from 'Specific date Foreign Exchange rates' API response	 
	

@NegativeScenarioLatestForeignExchangeRateswithBase
Scenario: validate the Latest Foreign Exchange Rates with Base when paramenter is wrongly passed
	Given User sends the Http request to the ratesAPI server with invalid Parameter
	And User selects the 'api/latest' Endpoint URL
	And User sets up the headers
	When User submits the 'GET' request
	Then Verify the expected StatusCode and StatusLine of the Response
	And Verify the expected Error Status Message from 'Specific date Foreign Exchange rates with Base' API response	 
	
@LatestForeignExchangeRateswithSymbolsandBase
Scenario: validate the Latest Foreign Exchange Rates with Symbols and Base using GET API
	Given User sends the Http request to the ratesAPI server with valid Parameter
	And User selects the 'api/latest' Endpoint URL
	And User sets up the headers
	When User submits the 'GET' request
	Then Verify the expected StatusCode and StatusLine of the Response
	And Verify the expected Status Message from 'Specific date Foreign Exchange rates' API response	 
	
	
	
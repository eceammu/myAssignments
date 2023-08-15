Feature: Login functionality of Leaftaps Application 

Background:
Given    Launch browser  
And      Load the url

Scenario: Login with Positive credentials

And      Enter the username as 'Demosalesmanager'
And      Enter the password as 'crmsfa'
When     Click on the Login button
Then     HomePage should be displayed 
Then     Close browser

Scenario: Login with Negative credentials
#Given    Launch browser  
#And      Load the url
And      Enter the username as 'Demo'
And      Enter the password as 'crmsfa'
When     Click on the Login button
But     ErrorMessage should be displayed 
Then     Close browser
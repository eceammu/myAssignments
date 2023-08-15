Feature: Merge Lead functionality of Leaftaps Application

Background:
Given Launch browser
And Load the url

Scenario Outline: MergeLead with two Lead IDs

Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then HomePage should be displayed
When Click on crmsfaLink
And Click Leads Button
And Click on Merge Lead
When Click on From Lead Lookup
And Move control to child window
And Enter the firstname in child window as <firstname1>
Then Click on Find Leads button
And Find LeadID of first resulting Lead in table 
And Click LeadID of first resulting Lead in table
And Move control to parent window
When Click on To Lead Lookup
And Move control to child window
And Enter the firstname in child window as <firstname2>
Then Click on Find Leads button
And Find LeadID of first resulting Lead in table it is To leadID
And Click LeadID of first resulting Lead in table
And Move control to parent window
When Click on Merge Lead Link
And Accept Alert
When Click on Find Leads Link
And Enter LeadID
Then Click on Find Leads button
And Check From Lead has no records so merged two leads correctly
Then Close browser
Examples:
|firstname1|firstname2| 
|Alamelumangai|Thiagarajan|
|Chellapriya|Venkatasubramaniyan|


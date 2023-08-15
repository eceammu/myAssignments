Feature: Delete Lead functionality of Leaftaps Application

Background:
Given Launch browser
And Load the url
#@smoke
Scenario Outline: Delete Lead with given leadID

Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then HomePage should be displayed
When Click on crmsfaLink
And Click Leads Button
When Click on Find Leads Link
And Click Phone tab
And Enter the phone Number as <phonenumber>
Then Click on Find Leads button
And Find LeadID of first resulting Lead in table 
And Click LeadID of first resulting Lead in table
When Click Delete Lead Link
When Click on Find Leads Link
And Enter LeadID
Then Click on Find Leads button
And Check Table has no records so Lead deleted
Then Close browser
Examples:
|phonenumber|
|99|
|9095632408|

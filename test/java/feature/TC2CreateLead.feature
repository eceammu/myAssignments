Feature: Create Lead functionality of Leaftaps Application

Background:
Given Launch browser
And Load the url

Scenario Outline: CreateLead with multiple data

Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then HomePage should be displayed
When Click on crmsfaLink
And Click Leads Button
And Click CreateLead link
Given Enter the companyname as <companyname>
And Enter the firstname as <firstname>
And Enter the lastname as <lastname> 
And Enter the phoneNumber as <phonenumber>
When Click on createLead button
Then ViewLeadsPage should be displayed as <companyname>
Then Close browser
Examples:
|companyname|firstname|lastname|phonenumber|  
|TestLeaf|Ammu|Venkat|9367729568|
|TestLeaf|Alamelumangai|T|9095632408|

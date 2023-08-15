Feature: Edit Lead functionality of Leaftaps Application

Background:
Given Launch browser
And Load the url

Scenario Outline: Edit Lead with multiple data

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
When Click on Find Leads Link
And Click Phone tab
And Enter the phone Number as <phonenumber>
Then Click on Find Leads button
And Click LeadID of first resulting Lead in table
And Click EditLead Link
And Update companyname as <newcompanyname>
And Click submit
Then Lead should be edited with companyName as <newcompanyname>
Then Close browser
Examples:
|companyname|firstname|lastname|phonenumber|newcompanyname|newcompanyname|
|BOA|Venkatasubramaniyan|V|9543637474|Infosys|Infosys Ltd|
|TCS|Thiagarajan|T|9095632408|NokiaSiemens|Siemens Ltd|

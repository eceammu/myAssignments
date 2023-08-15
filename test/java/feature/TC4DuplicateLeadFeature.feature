Feature: Duplicate Lead functionality of Leaftaps Application

Background:
Given Launch browser
And Load the url

Scenario Outline: Duplicate Lead with multiple data

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
And Enter the firstnamelocal as <firstnamelocal>
And Enter the departmentname as <departmentname>
And Enter the description as <description>
And Enter the primaryEmail as <primaryEmail>
And Select the stateProvinance as <stateProvinance>
When Click on createLead button
And Verify Title of page
When click Duplicate Lead button
And Duplicate Lead company Name Field as <companynamenew>
And Update Duplicate Lead first Name Field as <firstnamenew>
When Click on createLead button
And Verify Title of page
Then Close browser
Examples:
|companyname|firstname|lastname|phonenumber|firstnamelocal|departmentname|description|primaryEmail|stateProvinance|companynamenew|firstnamenew|
|TestLeaf|Chellapriya|Thiagarajan|99|Priya|Research And Development|Selenium Research|chellapriya1987@gmail.com|New York|Syntel|TestingPriya|
|TCS|Alamelumangai|T|9095632408|Ammu|Research And Development Testing|Automation Cucumber Research|eceammu@gmail.com|California|Nokia Siemens Networks|Allu|

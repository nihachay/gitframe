Feature: Test Login functionality

Scenario: Verify CrmPro Login functionality
Given launch the CrmPro application
When user enters valid Username and Password
Then user should be able to login Succesfully. 
#
#Scenario Outline: Creating new Contact
#Given user is already on home page 
#When user clicks on Contacts button and navigate to Newcontacts page
#Then user enters "<first name>" "<last name>" and "<position>"
#And user clicks on save button
#
#Examples:
#
#|firstname| |lastname| |position|
#|niha|      |arell|    |new|Wwwwwww
#|niha1|     |arell|    |copynew|

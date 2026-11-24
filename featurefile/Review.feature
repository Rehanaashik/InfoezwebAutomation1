Feature:Review submission

Scenario Outline:Verify review submission

Given user launched the applications url
When user logging into the application
And user navigates to the business content page
And user clicks the review button
And user selects the rating "<rating>"
And user enters the review comment "<comment>"
And user clicks the post review button
Then review submission status "<status>"
And user navigates to the my review page
Then  verified the reviewstatus "<reviewstatus>"

Examples:
|rating|comment       |status                  |reviewstatus|
|4     |good service  |Review posted           |displayed   |
|4     |hi            |Minimum character limit 3|not displayed|


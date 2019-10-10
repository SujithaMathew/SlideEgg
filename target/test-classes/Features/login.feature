Feature: to validate login functionality
BackGround: Given User is in login page
Scenario Outline: To verify registration page

When User has to enter "<Uname>","<Bemail>","<Pword>" and click loginin
Then when user enter incorrect details,user should not able to register

Examples:
|Uname|Bemail|Pword|
|Suji|suji@gmail.com|wert|
|Sujitha|sujijosephine@gmail.com|jasers12|
 
 Scenario Outline: To verify login page
 When User has to enter "<Username>","<Password>" and click login
 Then When user enters incorrect credentials,User should not able to login
 
 Examples:
 |Username|Password|
 |suji@gmail.com|fghjkllj|
 |sujijosephine@gmail.com|Suji$slideegg1|
 
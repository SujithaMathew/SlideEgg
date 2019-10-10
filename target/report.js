$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/login.feature");
formatter.feature({
  "name": "to validate login functionality",
  "description": "BackGround: Given User is in login page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To verify registration page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to enter \"\u003cUname\u003e\",\"\u003cBemail\u003e\",\"\u003cPword\u003e\" and click loginin",
  "keyword": "When "
});
formatter.step({
  "name": "when user enter incorrect details,user should not able to register",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Uname",
        "Bemail",
        "Pword"
      ]
    },
    {
      "cells": [
        "Suji",
        "suji@gmail.com",
        "wert"
      ]
    },
    {
      "cells": [
        "Sujitha",
        "sujijosephine@gmail.com",
        "jasers12"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To verify registration page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter \"Suji\",\"suji@gmail.com\",\"wert\" and click loginin",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.user_has_to_enter_and_click_loginin(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when user enter incorrect details,user should not able to register",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.when_user_enter_incorrect_details_user_should_not_able_to_register()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify registration page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter \"Sujitha\",\"sujijosephine@gmail.com\",\"jasers12\" and click loginin",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.user_has_to_enter_and_click_loginin(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when user enter incorrect details,user should not able to register",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.when_user_enter_incorrect_details_user_should_not_able_to_register()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To verify login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to enter \"\u003cUsername\u003e\",\"\u003cPassword\u003e\" and click login",
  "keyword": "When "
});
formatter.step({
  "name": "When user enters incorrect credentials,User should not able to login",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "suji@gmail.com",
        "fghjkllj"
      ]
    },
    {
      "cells": [
        "sujijosephine@gmail.com",
        "Suji$slideegg1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To verify login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter \"suji@gmail.com\",\"fghjkllj\" and click login",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.user_has_to_enter_and_click_login(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "When user enters incorrect credentials,User should not able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.when_user_enters_incorrect_credentials_User_should_not_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter \"sujijosephine@gmail.com\",\"Suji$slideegg1\" and click login",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.user_has_to_enter_and_click_login(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "When user enters incorrect credentials,User should not able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.when_user_enters_incorrect_credentials_User_should_not_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
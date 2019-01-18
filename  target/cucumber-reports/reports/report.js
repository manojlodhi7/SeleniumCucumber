$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginTest.feature");
formatter.feature({
  "line": 1,
  "name": "Verify login functionality",
  "description": "",
  "id": "verify-login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login as a authenticated user",
  "description": "",
  "id": "verify-login-functionality;login-as-a-authenticated-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@IntegrationTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is  on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "success message is displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "verify-login-functionality;login-as-a-authenticated-user;",
  "rows": [
    {
      "cells": [
        "username",
        "Password"
      ],
      "line": 11,
      "id": "verify-login-functionality;login-as-a-authenticated-user;;1"
    },
    {
      "cells": [
        "manoj",
        "manoj"
      ],
      "line": 12,
      "id": "verify-login-functionality;login-as-a-authenticated-user;;2"
    },
    {
      "cells": [
        "kumar",
        "kumar"
      ],
      "line": 13,
      "id": "verify-login-functionality;login-as-a-authenticated-user;;3"
    },
    {
      "cells": [
        "lodhi",
        "lodhi"
      ],
      "line": 14,
      "id": "verify-login-functionality;login-as-a-authenticated-user;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4350110246,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login as a authenticated user",
  "description": "",
  "id": "verify-login-functionality;login-as-a-authenticated-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@IntegrationTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is  on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"manoj\" and \"manoj\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "success message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest_step.user_is_on_homepage()"
});
formatter.result({
  "duration": 141486178,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "manoj",
      "offset": 13
    },
    {
      "val": "manoj",
      "offset": 25
    }
  ],
  "location": "LoginTest_step.user_enters_username_and_Password(String,String)"
});
formatter.result({
  "duration": 230918661,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_step.clicks_on_login_button()"
});
formatter.result({
  "duration": 63975234,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_step.success_message_is_displayed()"
});
formatter.result({
  "duration": 11168233,
  "error_message": "junit.framework.ComparisonFailure: Welcome expected:\u003c[Welcome]\u003e but was:\u003c[Alert message does not matched]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat home.stepDefs.LoginTest_step.success_message_is_displayed(LoginTest_step.java:38)\r\n\tat ✽.Then success message is displayed(LoginTest.feature:8)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 715973426,
  "status": "passed"
});
formatter.before({
  "duration": 3339744582,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login as a authenticated user",
  "description": "",
  "id": "verify-login-functionality;login-as-a-authenticated-user;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@IntegrationTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is  on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"kumar\" and \"kumar\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "success message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest_step.user_is_on_homepage()"
});
formatter.result({
  "duration": 69762764,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kumar",
      "offset": 13
    },
    {
      "val": "kumar",
      "offset": 25
    }
  ],
  "location": "LoginTest_step.user_enters_username_and_Password(String,String)"
});
formatter.result({
  "duration": 232030352,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_step.clicks_on_login_button()"
});
formatter.result({
  "duration": 78229766,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_step.success_message_is_displayed()"
});
formatter.result({
  "duration": 7151281,
  "error_message": "junit.framework.ComparisonFailure: Welcome expected:\u003c[Error Password or Username]\u003e but was:\u003c[Alert message does not matched]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat home.stepDefs.LoginTest_step.success_message_is_displayed(LoginTest_step.java:38)\r\n\tat ✽.Then success message is displayed(LoginTest.feature:8)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 696099268,
  "status": "passed"
});
formatter.before({
  "duration": 3579960729,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login as a authenticated user",
  "description": "",
  "id": "verify-login-functionality;login-as-a-authenticated-user;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@IntegrationTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is  on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"lodhi\" and \"lodhi\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "success message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest_step.user_is_on_homepage()"
});
formatter.result({
  "duration": 48607368,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lodhi",
      "offset": 13
    },
    {
      "val": "lodhi",
      "offset": 25
    }
  ],
  "location": "LoginTest_step.user_enters_username_and_Password(String,String)"
});
formatter.result({
  "duration": 199874216,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_step.clicks_on_login_button()"
});
formatter.result({
  "duration": 81207688,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_step.success_message_is_displayed()"
});
formatter.result({
  "duration": 4455798,
  "error_message": "junit.framework.ComparisonFailure: Welcome expected:\u003c[Welcome]\u003e but was:\u003c[Alert message does not matched]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat home.stepDefs.LoginTest_step.success_message_is_displayed(LoginTest_step.java:38)\r\n\tat ✽.Then success message is displayed(LoginTest.feature:8)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 766599328,
  "status": "passed"
});
});
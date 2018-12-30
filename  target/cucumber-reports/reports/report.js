$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginTest.feature");
formatter.feature({
  "line": 1,
  "name": "Verify login functionality",
  "description": "",
  "id": "verify-login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Login as a authenticated user",
  "description": "",
  "id": "verify-login-functionality;login-as-a-authenticated-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@IntegrationTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is  on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters username and Password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "success message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest_step.user_is_on_homepage()"
});
formatter.result({
  "duration": 5137587303,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_step.user_enters_username_and_Password()"
});
formatter.result({
  "duration": 330575462,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_step.clicks_on_login_button()"
});
formatter.result({
  "duration": 84240274,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_step.success_message_is_displayed()"
});
formatter.result({
  "duration": 8477231,
  "status": "passed"
});
});
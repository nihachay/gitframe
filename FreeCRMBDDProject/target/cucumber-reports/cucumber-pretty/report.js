$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application",
  "description": "",
  "id": "free-crm-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login functionality verification",
  "description": "",
  "id": "free-crm-application;free-crm-login-functionality-verification",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters User name and Password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User is on home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefination.user_is_already_in_login_page()"
});
formatter.result({
  "duration": 22592965900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.title_of_the_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 277110400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_enters_User_name_and_Password()"
});
formatter.result({
  "duration": 2257235800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1775393400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_home_page()"
});
formatter.result({
  "duration": 56900,
  "status": "passed"
});
});
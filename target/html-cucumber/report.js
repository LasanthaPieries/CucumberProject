$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Calculator.feature");
formatter.feature({
  "name": "Calculator Functions",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CalculatorStepDef.i_have_a_calculator()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Add two numbers",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "I add 4 and 5",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.CalculatorStepDef.i_add_and(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the result as 9",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.CalculatorStepDef.i_should_get_the_result_as(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/Login.feature");
formatter.feature({
  "name": "Login Feature Scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.LoginSetpDef.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Link",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.LoginSetpDef.i_click_on_the_Login_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "This sceanrio is to define the failure path 2",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "I enter the username as \"Abc@xyz.com\" and password as \"Abc@12344\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.LoginSetpDef.i_enter_the_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.LoginSetpDef.i_click_on_the_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the error message \"The email or password you have entered is invalid.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.LoginSetpDef.i_should_get_the_error_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
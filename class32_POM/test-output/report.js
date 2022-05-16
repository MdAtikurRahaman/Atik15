$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Feature_Login_Fuctionalities.feature");
formatter.feature({
  "name": "Login functionalities of your feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Login Fuctionalities",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in Landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.TestDef_Login_Functionalities.i_am_in_Landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login Menu",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.TestDef_Login_Functionalities.i_click_on_Login_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify I am in Employee Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.TestDef_Login_Functionalities.verify_I_am_in_Employee_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter User Id",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.TestDef_Login_Functionalities.i_enter_User_Id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Password",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.TestDef_Login_Functionalities.i_enter_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login Button",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.TestDef_Login_Functionalities.click_on_login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will be in my home page",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.TestDef_Login_Functionalities.i_will_be_in_my_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
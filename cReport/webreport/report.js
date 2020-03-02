$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/Login.feature");
formatter.feature({
  "name": "Hotel Booking",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login procuder",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdef.StepDefination.user_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the usernames and passwords",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdef.StepDefination.enter_the_usernames_and_passwords(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepdef.StepDefination.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdef.StepDefination.user_is_on_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
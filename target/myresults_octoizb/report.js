$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/validate_dth_recharge.feature");
formatter.feature({
  "name": "Validate dth recharge sub_module",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validate the bus module",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@bus"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch site using \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "prct3tests.SD02StepDefs2.method1(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter user id as \"srinivas2k13@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "prct3tests.SD02StepDefs2.method2(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as \"lalbalpal1905\"",
  "keyword": "And "
});
formatter.match({
  "location": "prct3tests.SD02StepDefs2.method3(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on submit",
  "keyword": "And "
});
formatter.match({
  "location": "prct3tests.SD02StepDefs2.method4()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on bus module",
  "keyword": "And "
});
formatter.match({
  "location": "prct3tests.SD02StepDefs2.method15()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select source city as \"hyderabad\"",
  "keyword": "And "
});
formatter.match({
  "location": "prct3tests.SD02StepDefs2.method16(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select destination city as \"delhi\"",
  "keyword": "And "
});
formatter.match({
  "location": "prct3tests.SD02StepDefs2.method17(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select date as \"6 june\"",
  "keyword": "And "
});
formatter.match({
  "location": "prct3tests.SD02StepDefs2.method18(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "date filed displayed as \"06/06/2020\"",
  "keyword": "Then "
});
formatter.match({
  "location": "prct3tests.SD02StepDefs2.method19(java.lang.String)"
});
formatter.write("Test failed");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close site",
  "keyword": "When "
});
formatter.match({
  "location": "prct3tests.SD02StepDefs2.method7()"
});
formatter.result({
  "status": "passed"
});
});
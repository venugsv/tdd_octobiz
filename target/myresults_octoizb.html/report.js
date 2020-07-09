$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login_feature01.feature");
formatter.feature({
  "name": "login_module",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validate the homepage title",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch site using \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "prct3tests.SD01StepDefs.method2(java.lang.String)"
});
formatter.result({
  "error_message": "io.cucumber.core.exception.CucumberException: Step [^launch site using \"chrome\"$] is defined with 1 parameters at \u0027prct3tests.SD01StepDefs.method2(java.lang.String)\u0027.\nHowever, the gherkin step has 0 arguments.\nStep text: launch site using \"chrome\"\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.arityMismatch(PickleStepDefinitionMatch.java:134)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:42)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "title should be \"OCTOBIZ-Agent Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "prct3tests.SD01StepDefs.method3(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "closesite",
  "keyword": "When "
});
formatter.match({
  "location": "prct3tests.SD01StepDefs.method4()"
});
formatter.result({
  "status": "skipped"
});
});
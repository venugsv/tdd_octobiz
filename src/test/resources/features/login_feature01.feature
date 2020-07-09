Feature: login_module
Scenario: validate the homepage title
Given launch site using "chrome"
Then title should be "OCTOBIZ-Agent Login"
When close site
 
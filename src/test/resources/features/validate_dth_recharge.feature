Feature: Validate dth recharge sub_module

@title
Scenario: validatege login
Given launch site using "chrome"
When enter user id as "srinivas2k13@gmail.com"
And enter password as "lalbalpal1905"
And click on submit
Then Agent should able to login and page title should be "ASMART E-BUZ INDIA PVT LTD"
When close site

@title
Scenario: validate the dth recharge 
Given launch site using "chrome"
When enter user id as "srinivas2k13@gmail.com"
And enter password as "lalbalpal1905"
And click on submit
And click on DTH
And Select option from dropdown as "Tata Sky"
And Enter amount as "25"
And Enter dth account number as "12345678"
And click on submit dth
Then display error message like "ERROR message like UNKNOWN error"
When close site
@dth2
Scenario: validate the dth recharge 
Given launch site using "chrome"
When enter user id as "srinivas2k13@gmail.com"
And enter password as "lalbalpal1905"
And click on submit
And click on DTH
And Select option from dropdown as "Tata Sky"
And Enter amount as ""
And Enter dth account number as "12345678"
And click on submit dth
Then display alert box error message like "please enter recharge amount"
When close site

Scenario: validate the dth recharge 
Given launch site using "chrome"
When enter user id as "srinivas2k13@gmail.com"
And enter password as "lalbalpal1905"
And click on submit
And click on DTH
And Select option from dropdown as "Sun Dirct"
And Enter amount as "25"
And Enter dth account number as ""
And click on submit dth
Then display alert box error message like "please enter recharge amount"
When close site
@bus
Scenario: validate the bus module 
Given launch site using "chrome"
When enter user id as "srinivas2k13@gmail.com"
And enter password as "lalbalpal1905"
And click on submit
And click on bus module
And select source city as "hyderabad"
And select destination city as "delhi"
And select date as "6 june"
Then date filed displayed as "06/06/2020" 
When close site